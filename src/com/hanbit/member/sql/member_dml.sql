-- id, password, name, ssn regdate


SELECT * FROM Member;
INSERT INTO Member(id, name, password, ssn, regdate)
VALUES('hong', '홍길동', '1', '860305-1234567', SYSDATE);
INSERT INTO Member(id, name, password, ssn, regdate)
VALUES('kim', '김유신', '1', '900606-1232323', SYSDATE);
INSERT INTO Member(id, name, password, ssn, regdate)
VALUES('dong', '홍길동', '1', '700707-1234545', SYSDATE);
INSERT INTO Member(id, name, password, ssn, regdate)
VALUES('gil', '홍길동', '1', '600808-1235858', SYSDATE);
INSERT INTO Member(id, name, password, ssn, regdate)
VALUES('111', '박지성', '1', '911212-1234567', SYSDATE);
INSERT INTO Member(id, name, password, ssn, regdate)
VALUES('222', '이영표', '1', '821212-2234567', SYSDATE);
INSERT INTO Member(id, name, password, ssn, regdate)
VALUES('333', '임요환', '1', '731212-2234567', SYSDATE);
INSERT INTO Member(id, name, password, ssn, regdate)
VALUES('444', '서인국', '1', '641212-2234567', SYSDATE);
INSERT INTO Member(id, name, password, ssn, regdate)
VALUES('555', '정우성', '1', '551212-2234567', SYSDATE);
INSERT INTO Member(id, name, password, ssn, regdate)
VALUES('666', '장동건', '1', '461212-2234567', SYSDATE);
INSERT INTO Member(id, name, password, ssn, regdate)
VALUES('777', '김우빈', '1', '371212-2234567', SYSDATE);

update MEMBER
set name = '동길홍'
where name='박재홍';
