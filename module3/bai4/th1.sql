explain SELECT * FROM customers where customerNumber=175;
--- them chi muc
alter table customers add index idx_customerNumber(customerNumber); 
--- test
 SELECT * FROM customers where customerNumber=175;
 --- xoa chi muc
 alter table customers drop index idx_customerNumber;
