CREATE OR REPLACE PROCEDURE TransferFunds(
    p_SourceVault IN NUMBER,
    p_TargetVault IN NUMBER,
    p_TransferAmount IN NUMBER
)
AS
    v_CurrentFunds NUMBER;
BEGIN
    SELECT CurrentFunds
    INTO v_CurrentFunds
    FROM FinVault
    WHERE VaultAccNo = p_SourceVault;

    IF v_CurrentFunds >= p_TransferAmount THEN
        UPDATE FinVault
        SET CurrentFunds = CurrentFunds - p_TransferAmount
        WHERE VaultAccNo = p_SourceVault;

        UPDATE FinVault
        SET CurrentFunds = CurrentFunds + p_TransferAmount
        WHERE VaultAccNo = p_TargetVault;

        COMMIT;
    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient Balance');
    END IF;
END;
/

BEGIN
    TransferFunds(101, 102, 5000);
END;
/
