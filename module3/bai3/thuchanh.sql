select status, sum(quantityOrdered * priceEach) as amonnt
from orders 
inner join orderdetails on orders.ordernumber = orderdetails.ordernumber
group by status;
select orderNumber, sum(quantityOrdered * priceEach) as total
from orderdetails
group by orderNumber;