
DECLARE
    CURSOR c IS
        SELECT CustomerID, Balance
        FROM Customers;
BEGIN
    FOR r IN c LOOP
        IF r.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = TRUE
            WHERE CustomerID = r.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;
/
