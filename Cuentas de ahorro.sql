DELIMITER //
CREATE PROCEDURE getsavingaccounts()
BEGIN
   select Account_Name, Account_number, Balance from taccounts1  where savingac ='Y' ;
   END //

DELIMITER ;

COMMIT;