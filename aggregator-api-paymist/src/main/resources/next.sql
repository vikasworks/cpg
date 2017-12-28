/* for Signup table */


CREATE TABLE `sign_up_user` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(100) NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `user_name` VARCHAR(100) NOT NULL,
  `contact_no` VARCHAR(100) NOT NULL,
  `company_address` VARCHAR(100) NOT NULL,
  `email_id` VARCHAR(100) NOT NULL,
   `created_on` VARCHAR(100) NOT NULL,
  `modified_on` VARCHAR(100) NOT NULL, 
  PRIMARY KEY (`ID`)
) ENGINE=INNODB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1