insert into user_details(id,name,birth_date)
values(10001, 'Kittu', current_date());

insert into user_details(id,name,birth_date)
values(10002, 'Bathina', current_date());

insert into user_details(id,name,birth_date)
values(10003, 'Srav', current_date());

insert into post(id, description, user_id)
values(20001, 'I want to Learn AWS', 10001);

insert into post(id, description, user_id)
values(20002, 'I want to Learn GIT', 10001);

insert into post(id, description, user_id)
values(20003, 'I want to Learn DevOps', 10002);

insert into post(id, description, user_id)
values(20004, 'I want to Learn FullStack', 10002);

insert into post(id, description, user_id)
values(20005, 'I want to Learn AZURE', 10003);