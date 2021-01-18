---tao cai proseduce 
delimiter //
create procedure find_all_customer()
begin
select * from customers;
end ;
// delimiter ;
call find_all_customer();
--- tao cai proseduce cos country la "usa"
delimiter //
create procedure customners_in_usa()
begin
select * from customers where country="usa";
end;
// delimiter ;
call customners_in_usa();
--- tao cai proseduce cos country la "usa" va city la "nyc"
delimiter //
create procedure customners_in_usa_and_city_in_nyc()
begin
select * from customers where country="usa" and city="nyc";
end;
// delimiter ;
call customners_in_usa_and_city_in_nyc();




