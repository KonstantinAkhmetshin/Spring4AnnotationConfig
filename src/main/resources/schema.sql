CREATE TABLE ACCOUNTS(
PAN char(20) not null PRIMARY KEY,
PIN_CODE char(4) not null,
PIN_COUNTER int not null,
BALANCE numeric(12,2) not null
);

CREATE TABLE TRANSACTIONS (
TRANSACTION_ID int not null PRIMARY KEY,
PAN_ID char(20) not null,
OPERATION_DESCR char(100) not null,
OPERATION_DATE TIMESTAMP not null
);


