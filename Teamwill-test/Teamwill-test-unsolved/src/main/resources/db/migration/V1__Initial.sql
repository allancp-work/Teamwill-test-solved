create table ranking (id int not null, name varchar(50) not null, rank int not null);

insert into ranking (id, name, rank) values (1, 'Alexandre', 80);
insert into ranking (id, name, rank) values (2, 'Felipe', 75);
insert into ranking (id, name, rank) values (3, 'Junior', 90);
insert into ranking (id, name, rank) values (4, 'Marcio', 90);
insert into ranking (id, name, rank) values (5, 'Francisco', 82);
insert into ranking (id, name, rank) values (6, 'Eduardo', 46);
insert into ranking (id, name, rank) values (7, 'Monica', 81);
insert into ranking (id, name, rank) values (8, 'Janaina', 91);
insert into ranking (id, name, rank) values (9, 'João', 77);
insert into ranking (id, name, rank) values (10, 'Pedro', 60);



create table app_user (id bigint PRIMARY KEY, name varchar(50) not null, password varchar(255) not null, username varchar(255) not null);

insert into app_user (id, name, password, username) VALUES (1, 'Manager Name', '$2a$10$Hp25j2EPTMbMZ3HJfHFFgOTUscbIN45SeB9d/kXI.SxjxWmFJ6cQG', 'manager');
insert into app_user (id, name, password, username) VALUES (2, 'Allan', '$2a$10$Hp25j2EPTMbMZ3HJfHFFgOTUscbIN45SeB9d/kXI.SxjxWmFJ6cQG', 'acoelho');


create table role (id bigint PRIMARY KEY, name varchar(50) not null);

insert into role (id, name )values (1, 'ROLE_ADMIN');
insert into role (id, name )values (2, 'ROLE_USER');


create table app_user_roles (app_user_id bigint not null, roles_id bigint not null);

insert into app_user_roles (app_user_id, roles_id) VALUES (1, 1);
insert into app_user_roles (app_user_id, roles_id) VALUES (1, 2);
insert into app_user_roles (app_user_id, roles_id) VALUES (2, 2);

ALTER TABLE app_user_roles ADD FOREIGN KEY (roles_id)  REFERENCES ROLE(id);

ALTER TABLE app_user_roles ADD FOREIGN KEY (app_user_id)  REFERENCES app_user(id);



