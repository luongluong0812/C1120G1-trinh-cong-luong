create table hocsinh(
id int auto_increment primary key,
ten varchar(50),
tuoi int,
khoahoc varchar(50),
sotien float
);
insert into hocsinh(ten,tuoi,khoahoc,sotien)
values("hoang",21,"cntt",40000),
("viet",21,"dttv",320000),
("thanh",19,"ktdn",400000),
("nhan",18,"ck",400000),
("huong",19,"tcnh",5000),
("huong",20,"tcnh",150000);
--- Viết câu lệnh hiện thị tất cả các dòng có tên là Huong
select * from hocsinh where ten="huong";
--- Viết câu lệnh lấy ra tổng số tiền của Huong
select  sum(sotien) from hocsinh where ten like"huong";
--- kiem tra bang
select* from hocsinh;
---  Viết câu lệnh lấy ra tên danh sách của tất cả học viên, không trùng lặp
select distinct ten from hocsinh;

