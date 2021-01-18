create database furama;
--- tao bang loai kh ok
create table loaikhach(
id_loaikhach int primary key,
tenloaikhachhang varchar(30)
);
--- tao bang khach hang ok
create table khachhang(
id_khachhang int primary key,
id_loaikhach int,
hoten varchar(20),
ngaysinh date,
cmnd varchar(15),
sdt varchar(10),
email varchar(30),
diachi varchar(1000),
FOREIGN key (id_loaikhach) REFERENCES loaikhach(id_loaikhach)
 );
 --- tao bang loai dich vu ok
 create table loaidichvu(
 id_loaidichvu int primary key,
 tenloaidichvu varchar(30)
 );
 --- tao bang dich vu ok
 create table dichvu(
 id_dichvu int primary key,
 tendichvu varchar(50),
 dientich int,
 sotang int,
 songuoitoida varchar(20),
 chiphithue varchar(20),
 id_kieuthue int,
 id_loaidichvu int,
 trangthai varchar(20)
 
 
);
 --- tao bang kieu thue ok
 create table kieuthue(
 id_kieuthue int primary key,
 tenkieuthue varchar(50),
 gia int
 );
 --- tao bang dich vu di kem ok
 create table dichvudikem(
 id_dichvudikem int primary key,
 tendichvudikem varchar(50),
 gia int,
 donvi int,
 trangthaikhadung varchar(50)
 );
 --- tao bang hop dong chi tiet ok
 create table hopdongchitiet (
 id_hopdongchitiet int primary key,
 id_hopdong int,
 id_dichvudikem int,
 soluong int

 );
 --- hop dong ok
 create table hopdong(
 id_hopdong int primary key,
 id_nhanvien int,
 id_khachhang int,
 id_tendichvu int,
 ngaylamhopdong date,
 ngayketthuc date,
 tiendatcoc int,
 tongtien int


 );
 -- tao bang vi tri ok
 create table vitri(
 id_vitri int primary key,
 tenvitri varchar(50)
 );
 -- tao bang trinh do ok
 create table trinhdo(
 id_trinhdo int primary key,
 trinhdo varchar(50)
 );
 -- tao bang bo phan ok
 create table bophan(
 id_bophan int primary key,
 tenbophan varchar(50)
 );
 -- tao bang nhan vien ok
 create table nhanvien(
 id_nhanvien int primary key,
 hoten varchar(50),
 id_vitri int,
 id_trinhdo int,
 id_bophan int,
 ngaysinh date,
cmnd varchar(50),
sdt varchar(50),
email varchar(30), 
foreign key (id_vitri) references vitri(id_vitri),
foreign key(id_trinhdo) references trinhdo(id_trinhdo),
foreign key(id_bophan) references bophan(id_bophan)
 );
 -- khoa ngoai cho bang dich vu
 alter table dichvu 
 add (foreign key(id_loaidichvu) references loaidichvu(id_loaidichvu),
 foreign key(id_kieuthue) references kieuthue(id_kieuthue));
 -- khoa ngoa cho hop dong chi tiet
 alter table hopdongchitiet
 add ( foreign key(id_hopdong) references hopdong(id_hopdong),
 foreign key(id_dichvudikem) references dichvudikem(id_dichvudikem));
 alter table hopdong
 add( foreign key (id_tendichvu) references dichvu(id_dichvu),
 foreign key(id_khachhang) references khachhang(id_khachhang),
 foreign key(id_nhanvien) references nhanvien(id_nhanvien));