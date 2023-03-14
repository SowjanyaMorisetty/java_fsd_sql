



CREATE TABLE OWNERS (
    OWNER_ID VARCHAR(10),
    OWNER_NAME VARCHAR(20),
    ADDRESS VARCHAR(20),
    PHONE_NO BIGINT,
    EMAIL_ID VARCHAR(20),
    PRIMARY KEY (OWNER_ID)
);
CREATE TABLE CARS (
    CAR_ID VARCHAR(10),
    CAR_NAME VARCHAR(20),
    CAR_TYPE VARCHAR(20),
    OWNER_ID VARCHAR(20),
    PRIMARY KEY (CAR_ID),
    FOREIGN KEY (OWNER_ID)
        REFERENCES OWNERS (OWNER_ID)    
);

CREATE TABLE RENTALS (
    RENTAL_ID VARCHAR(10),
    customer_id VARCHAR(10),
    FOREIGN KEY (CUSTOMER_ID)
        REFERENCES CUSTOMER (CUSTOMER_ID),
    CAR_ID VARCHAR(10),
    FOREIGN KEY (CAR_ID)
        REFERENCES CARS (CAR_ID),
    PICKUP_DATE DATE,
    RETURN_DATE DATE,
    KM_DRIVEN INT,
    FARE_AMOUNT DOUBLE(10,2),
    PRIMARY KEY (RENTAL_ID)
);

CREATE TABLE CUSTOMER(
    CUSTOMER_ID VARCHAR(10),
    CUSTOMER_NAME VARCHAR(20),
    ADDRESS VARCHAR(20),
    PHONE_NO BIGINT,
    EMAIL_ID VARCHAR(20),
    PRIMARY KEY (CUSTOMER_ID)
);
INSERT INTO OWNERS VALUES(1,"sowjanya","HYD",1234567890,"SOWJI@GMAIL.COM");
INSERT INTO OWNERS VALUES(2,"YASHWANTH","NALGONDA",0987654321,"YASH@GMAIL.COM");
INSERT into OWNERS VALUES(3,"MEGHANA","KODAD",567891234,"MEGHA@GMAIL.COM");
INSERT INTO OWNERS VALUES(4,"NARSIMHA","KPHB",5432178908,"NARASIMHA@GMAIL.COM");
INSERT INTO OWNERS VALUES(5,"SUVARNA","ADHIBATLA",0987645455,"SUVARNA@GMAIL.COM");
INSERT INTO OWNERS VALUES(6,"KARTHIK","VIJAYWADA",4598723546,"KARTHIK@GMAIL.COM");

INSERT INTO CARS VALUES("V004","SWIFT","AUTOGEAR",1);
INSERT INTO CARS VALUES("V007","AUDI","AUTOGEAR",2);
INSERT INTO CARS VALUES("V003","RANGEROVER","AUTOGEAR",3);
INSERT INTO CARS VALUES("V001","QUID","GEAR",4);
INSERT INTO CARS VALUES("V005","ENOVA","GEAR",5);
INSERT INTO CARS VALUES("V006","POLO","GEAR",6);

INSERT INTO RENTALS VALUES("R001","C007","V004",'2018-03-10','2018-03-10',800,9000);
INSERT INTO RENTALS VALUES("R002","C001","V007",'2018-03-11','2018-03-12',200,3000);
INSERT INTO RENTALS  VALUES("R003","C007","V003",'2018-04-15','2018-04-15',100,1500);
INSERT INTO RENTALS VALUES("R004","C007","V001",'2018-05-16','2018-05-18',1000,10000);
INSERT INTO RENTALS VALUES("R005","C004","V005",'2018-05-10','2018-05-12',900,11000);
INSERT INTO RENTALS VALUES("R006","C004","V006",'2018-05-20','2018-05-21',200,2500);

INSERT INTO CUSTOMER values('C001',"SIRI","KUKATPALLY",3456789098,"SIRI@GMAIL.COM");
INSERT INTO CUSTOMER VALUES('C002',"USHA","HIGHTECHCITY",0987458756,"USHA@GMAIL.COM");
insert INTO CUSTOMER VALUES('C003','SATISH','AMEERPET',3457899878,"SATISH@GMAIL.COM");
INSERT INTO CUSTOMER VALUES('C004','MOUNI',"HAYATH NAGAR",098762345,"MOUNI@GMAIL.COM");
INSERT INTO CUSTOMER VALUES('C005','RAJINI',"CHAITANYAPURI",5670981234,"RAJINI@GMAIL.COM");
INSERT INTO CUSTOMER VALUES('C006','DIVYA',"DILSUKNAGAR",7651298575,"DIVYA@MAIL.COM");

SET SQL_SAFE_UPDATES=0;
update RENTALS SET PICKUP_DATE='2018-05-10' ,PICKUP_DATE='2018-05-20' WHERE PICKUP_DATE=NULL;
SELECT C.CAR_ID,C.CAR_NAME,C.CAR_TYPE FROM CARS C,rentals R WHERE (C.CAR_ID=R.CAR_ID AND PICKUP_DATE=NULL);
SELECT * FROM RENTALS;
SET FOREIGN_KEY_CHECKS=0;
UPDATE RENTALS SET CAR_ID='V002' WHERE CAR_ID='V004';

SELECT CAR_ID ,CAR_NAME,CAR_TYPE FROM CARS  WHERE CAR_ID NOT IN(SELECT CAR_ID FROM RENTALS) order by CAR_ID;
UPDATE TOUPDATE SET PICKUP_DATE='2018-05-10' WHERE PICKUP_DATE=NULL;