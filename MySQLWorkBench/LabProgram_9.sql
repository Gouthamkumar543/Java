USE applicationdb;
CREATE TABLE registration (
    UNAME    VARCHAR(15),
    UMAIL    VARCHAR(50),
    UPASS    VARCHAR(20),
    UDOB     DATE,
    UGENDER  VARCHAR(6),
    UPHONE   VARCHAR(15),
    UCOUNTRY VARCHAR(30),
    PRIMARY KEY (UMAIL)
);

SELECT * FROM registration;