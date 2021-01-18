delimiter //
create procedure city_is_nyc2(in key_word varchar(20),in key2 varchar(20))
begin
select * from customers where city like concat('%',key_word,'%') and `customername` like concat('%',key2,'%');
end;
// delimiter ;
call city_is_nyc2("nyc","toy");
--- test---
delimiter //
create procedure info_by_city(in key2 varchar(20))
begin
select * from customers where city like concat("%",key2,"%");
end;
// delimiter ;
call info_by_city("nyc")
