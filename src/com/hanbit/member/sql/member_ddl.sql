-- id, password, name, ssn regdate

CREATE TABLE Member(
	name VARCHAR2(20),
	id VARCHAR2(10), 
	password VARCHAR2(10),
	ssn VARCHAR2(15),
	regdate DATE,
	PRIMARY KEY(id)
);
SELECT * FROM Member;
DROP TABLE Member;
