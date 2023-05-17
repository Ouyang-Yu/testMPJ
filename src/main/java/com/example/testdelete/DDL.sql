create table account
(
    id      bigint      null,
    name    varchar(50) null,
    age     int         null,
    role_id int         null
);

INSERT INTO account (id, name, age, role_id) VALUES (1, '11', 111, 1);
INSERT INTO account (id, name, age, role_id) VALUES (2, '22', 222, 1);
INSERT INTO account (id, name, age, role_id) VALUES (3, '33', 3333, 1);


create table role
(
    id   int         null,
    name varchar(32) null
);

INSERT INTO role (id, name) VALUES (1, '管理员');