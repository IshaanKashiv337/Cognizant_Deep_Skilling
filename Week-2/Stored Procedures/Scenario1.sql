CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
AS
BEGIN
    UPDATE FinVault
    SET CurrentFunds = CurrentFunds + (CurrentFunds * 0.01)
    WHERE DepositCategory = 'Savings';

    COMMIT;
END;
/

BEGIN
    ProcessMonthlyInterest;
END;
/
