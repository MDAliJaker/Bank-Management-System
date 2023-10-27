create database bankSystem;
use bankSystem;

create table signup(from_no varchar(30),name varchar(40),father_name varchar(40), mother_name varchar(40),dob varchar(30), gender varchar(20), occupation varchar(40), phone varchar(15), email varchar(60), marital_status varchar(15), address varchar(100), zip varchar(15), city varchar(25));
select * from signup;

create table signup2(from_no varchar(30),Rligion varchar(40),Education varchar(40), Occupassion_Briefly varchar(40),Monthly_Income varchar(20), Birth_Cert_No varchar(40), NID_No varchar(40), TIN_Cert_No varchar(40), Senior_Citizen varchar(15), Existing_Account varchar(15) );
select * from signup2;

create table signup3(from_no varchar(30),Account_Type varchar(50),Account_Card_NO varchar(25), Pin varchar(25),Required_Facility varchar(250));
select * from signup3;

create table login(from_no varchar(30),Account_Card_NO varchar(50), Pin varchar(25));
select * from login;

create table balance(Pin varchar(25),Deposit_Date varchar(50),Type varchar(20),Amount varchar(40), Depositing_Person varchar(30), Depositers_NID varchar(30));
select* from balance;

create table transacton_history(Pin varchar(25),Transaction_Date varchar(50),Type varchar(20),Amount varchar(40),Transacting_Memo_No varchar(30) ,Transacting_Person varchar(30), Transecting_NID varchar(30));
