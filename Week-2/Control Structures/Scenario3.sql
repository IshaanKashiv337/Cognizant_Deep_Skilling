

BEGIN
    FOR r IN (
        SELECT c.Name, l.LoanID, l.DueDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ' || r.LoanID ||
            ' for ' || r.Name ||
            ' is due on ' || TO_CHAR(r.DueDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/
