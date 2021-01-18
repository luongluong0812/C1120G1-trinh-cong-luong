create view custommer_view as
select customername,phone
from customers;
select * from custommer_view;
drop view custommer_view;