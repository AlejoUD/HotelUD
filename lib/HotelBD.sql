CREATE DATABASE Hotel;
use Hotel;
CREATE TABLE`users`(  
`counter` int (11) AUTO_INCREMENT,  
`name` varchar (150) DEFAULT NULL,  
`surname` varchar (500) DEFAULT NULL,  
`dni` varchar (150) DEFAULT NULL,  
`gender` varchar (150) DEFAULT NULL, 
`age` int(5) DEFAULT NULL,   
`bankCount` varchar (150) DEFAULT NULL,  
PRIMARY KEY (`counter`)
);

drop table users;
select * from users;
delete from users where surname= surname;
truncate users;