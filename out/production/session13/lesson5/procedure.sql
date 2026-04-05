use jdbc;

create table Student(
	id int auto_increment primary key,
    fullname varchar(100) not null,
    email varchar(100) not null unique,
    phone varchar(100) not null unique,
    address varchar(255) not null,
    gender boolean not null
);

INSERT INTO Student (fullname, email, phone, address, gender) VALUES
('Nguyen Van A', 'a@gmail.com', '0900000001', 'Ha Noi', true),
('Tran Thi B', 'b@gmail.com', '0900000002', 'Ho Chi Minh', false),
('Le Van C', 'c@gmail.com', '0900000003', 'Da Nang', true),
('Pham Thi D', 'd@gmail.com', '0900000004', 'Can Tho', false),
('Hoang Van E', 'e@gmail.com', '0900000005', 'Hai Phong', true),
('Vu Thi F', 'f@gmail.com', '0900000006', 'Nha Trang', false),
('Dang Van G', 'g@gmail.com', '0900000007', 'Hue', true),
('Bui Thi H', 'h@gmail.com', '0900000008', 'Quang Ninh', false),
('Do Van I', 'i@gmail.com', '0900000009', 'Vung Tau', true),
('Nguyen Thi K', 'k@gmail.com', '0900000010', 'Binh Duong', false);

delimiter // 
create procedure get_all_student()
begin
  select * from Student;
end //
delimiter ;

delimiter // 
create procedure get_student_by_id(p_id int)
begin
  select * from Student where id = p_id;
end //
delimiter ;

delimiter // 
create procedure insert_student(
	p_fullname varchar(100),
    p_email varchar(100),
    p_phone varchar(100),
    p_address varchar(100),
    p_gender boolean
)
begin
  insert into Student(fullname,email,phone,address,gender) values
  (p_fullname, p_email, p_phone,p_address, p_gender);
end //
delimiter ;

delimiter // 
create procedure update_student(
	p_id int,
    p_fullname varchar(100),
    p_email varchar(100),
    p_phone varchar(100),
    p_address varchar(100),
    p_gender boolean
)
begin
	update Student set
		fullname = p_fullname,
        email = p_email,
        phone = p_phone,
        address = p_address,
        gender = p_gender
	where id = p_id;
end //
delimiter ;

delimiter // 
create procedure delete_student(
	p_id int
)
begin
	delete from Student where id = p_id;
end //
delimiter ;