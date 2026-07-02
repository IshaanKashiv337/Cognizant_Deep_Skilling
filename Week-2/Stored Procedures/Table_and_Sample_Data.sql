CREATE TABLE FinVault (
    VaultAccNo NUMBER PRIMARY KEY,
    ClientRefNo NUMBER,
    DepositCategory VARCHAR2(20),
    CurrentFunds NUMBER(10,2)
);

CREATE TABLE StaffRegistry (
    StaffCode NUMBER PRIMARY KEY,
    StaffFullName VARCHAR2(50),
    WorkDivision VARCHAR2(30),
    MonthlyPay NUMBER(10,2)
);

INSERT INTO FinVault VALUES (101, 1001, 'Savings', 50000);
INSERT INTO FinVault VALUES (102, 1002, 'Savings', 75000);
INSERT INTO FinVault VALUES (103, 1003, 'Current', 60000);
INSERT INTO FinVault VALUES (104, 1004, 'Savings', 40000);
INSERT INTO FinVault VALUES (105, 1005, 'Current', 30000);

INSERT INTO StaffRegistry VALUES (1, 'Aarav Mehta', 'IT', 50000);
INSERT INTO StaffRegistry VALUES (2, 'Meera Kapoor', 'HR', 45000);
INSERT INTO StaffRegistry VALUES (3, 'Vivaan Sharma', 'IT', 60000);
INSERT INTO StaffRegistry VALUES (4, 'Ananya Gupta', 'Finance', 55000);
INSERT INTO StaffRegistry VALUES (5, 'Reyansh Verma', 'HR', 48000);

COMMIT;
