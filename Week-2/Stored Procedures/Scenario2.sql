CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_WorkDivision IN VARCHAR2,
    p_BonusPercent IN NUMBER
)
AS
BEGIN
    UPDATE StaffRegistry
    SET MonthlyPay = MonthlyPay + (MonthlyPay * p_BonusPercent / 100)
    WHERE WorkDivision = p_WorkDivision;

    COMMIT;
END;
/

BEGIN
    UpdateEmployeeBonus('IT', 10);
END;
/
