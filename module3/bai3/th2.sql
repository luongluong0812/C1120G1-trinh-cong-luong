select customers.customerName,phone,paymentDate,amount
from customers
join payments
on customers.customerNumber=payments.customerNumber
where city="las vegas";
select customers.customerNumber,customers.city, customers.customerName, orders.orderNumber, orders.status
from customers
left join orders
on customers.customerNumber = orders.customerNumber 
where status="in process" and city like "%mad%";
