CREATE DATABASE IF NOT exists hotel;
use hotel;
CREATE TABLE`users`(  
`counter` int (11) AUTO_INCREMENT,  
`name` varchar (150) DEFAULT NULL,  
`password` varchar (500) DEFAULT NULL,  
`dni` varchar (150) DEFAULT NULL,  
`gender` varchar (150) DEFAULT NULL, 
`age` int(5) DEFAULT NULL,   
`bankCount` varchar (150) DEFAULT NULL,  
PRIMARY KEY (`counter`)
);

CREATE TABLE`workers`(  
`counter` int (11) AUTO_INCREMENT,  
`name` varchar (150) DEFAULT NULL,  
`dni` varchar (150) DEFAULT NULL,  
`gender` varchar (150) DEFAULT NULL, 
`age` int(5) DEFAULT NULL,    
PRIMARY KEY (`counter`)
);

CREATE TABLE`room`(  
`numberDoor` int (11) AUTO_INCREMENT,
`type` varchar (150) DEFAULT NULL,  
`surface` int(5) DEFAULT NULL,    
`floor` int(5) DEFAULT NULL,
`ocupation` varchar (150) DEFAULT NULL,
PRIMARY KEY (`numberDoor`)
);
CREATE TABLE`dependients`(  
`counter` int (11) AUTO_INCREMENT,  
`name` varchar (150) DEFAULT NULL, 
`dni` varchar (150) DEFAULT NULL,  
`password` varchar (500) DEFAULT NULL,   
`gender` varchar (150) DEFAULT NULL, 
`position` varchar (150) DEFAULT NULL, 
`description` varchar (150) DEFAULT NULL,    
`bankAccount` varchar (150) DEFAULT NULL,  
PRIMARY KEY (`counter`)
);

CREATE TABLE`roomAsig`(  
`numberDoor` int (11) DEFAULT NULL,
`type` varchar (150) DEFAULT NULL,  
`surface` int(5) DEFAULT NULL,    
`floor` int(5) DEFAULT NULL,
`ocupation` varchar (150) DEFAULT NULL,
`dni` varchar (150) DEFAULT NULL,
`fecha` varchar (150)  DEFAULT NULL,
UNIQUE (`numberDoor`)
);

CREATE TABLE`menu`(  
`counter` int (11) AUTO_INCREMENT,  
`Plato1` varchar (150) DEFAULT NULL,  
`Plato2` varchar (500) DEFAULT NULL,  
`Postre` varchar (150) DEFAULT NULL,  
`Bebida` varchar (150) DEFAULT NULL, 
`Condimentos` varchar (150) DEFAULT NULL,   
PRIMARY KEY (`counter`)
);

drop table room;
drop table roomasig;
select * from users;
select * from menu;
truncate menu;
select * from workers;
select * from room;
select * from dependients;
delete from users where surname= surname;
truncate users;
drop database Hotel;