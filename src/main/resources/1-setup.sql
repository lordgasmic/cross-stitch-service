create user xstitch_appl identified by 'xstitch_appl_password';

create table floss(
    id int not null auto_increment primary key,
    brand nvarchar(255),
    color_code int,
    length nvarchar(255),
    thread_count int
);

create table floss_inventory(
    id int not null auto_increment primary key,
    brand nvarchar(255),
    color_code int,
    length nvarchar(255)
);

create table floss_pattern(
    id int not null auto_increment primary key,
    name nvarchar(255),
    size int,
    height nvarchar(255),
    width nvarchar(255)
);

create or replace view floss_vw as select * from floss;
grant select, insert, update, delete on web.floss_vw to 'xstitch_appl'@'localhost';

create or replace view floss_inventory_vw as select * from floss_inventory;
grant select, insert, update, delete on web.floss_inventory_vw to 'xstitch_appl'@'localhost';

create or replace view floss_pattern_vw as select * from floss_pattern;
grant select, insert, update, delete on web.floss_pattern_vw to 'xstitch_appl'@'localhost';

