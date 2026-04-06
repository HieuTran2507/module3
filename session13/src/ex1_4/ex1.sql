use jdbc;

create table ex_students(
	id int auto_increment primary key,
    fullname varchar(100) not null,
    day_of_birth date not null,
    email varchar(100) not null unique
);

delimiter // 
create procedure ex_get_all_student()
begin
	select * from ex_students;
end //
delimiter ;

delimiter //
create procedure ex_insert_student(
	p_name varchar(100),
    p_dob date,
    p_email varchar(100)
)
begin
	insert into ex_students(fullname,day_of_birth,email) 
    values(p_name, p_dob, p_email);
end //
delimiter ;

delimiter // 
create procedure ex_update_student(
	p_id int,
    p_name varchar(100),
    p_dob date,
    p_email varchar(100)
)
begin 
	update ex_students set
		fullname = p_name,
        day_of_birth = p_dob,
        email = p_email
	where id = p_id;
end //
delimiter ;

delimiter //
create procedure ex_find_by_id(p_id int)
begin
	select * from ex_students where id = p_id;
end // 
delimiter ;

delimiter //
create procedure ex_delete(p_id int)
begin
	delete from ex_students where id = p_id;
end //
delimiter ;

