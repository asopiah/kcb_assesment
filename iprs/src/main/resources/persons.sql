-- auto-generated definition
create table persons
(
    id              int auto_increment
        primary key,
    alien_id        varchar(255) null,
    date_of_birth   varchar(255) null,
    first_name      varchar(255) null,
    gendeer         varchar(255) null,
    last_name       varchar(255) null,
    middle_name     varchar(255) null,
    nationalid      varchar(255) null,
    passport_number varchar(255) null
);

INSERT INTO iprs.persons (id, alien_id, date_of_birth, first_name, gendeer, last_name, middle_name, nationalid, passport_number) VALUES (1, '113214', '1231312', 'Test', 'male', 'test', 'test', '232321', '255353');
INSERT INTO iprs.persons (id, alien_id, date_of_birth, first_name, gendeer, last_name, middle_name, nationalid, passport_number) VALUES (2, '32323', '2312321', 'Ok', 'Female', 'test ok', 'Tesk ok', '3434334', '34324');
