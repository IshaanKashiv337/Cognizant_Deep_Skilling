DECLARE
    CURSOR c IS
        SELECT CustomerID, Age
        FROM Customers;
BEGIN
    FOR r IN c LOOP
        IF r.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = r.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;
/

