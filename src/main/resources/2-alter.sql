drop table if exists floss;
drop table if exists floss_inventory;
drop table if exists floss_pattern;

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

create or replace view floss_inventory_vw as select * from floss_inventory;

create or replace view floss_pattern_vw as select * from floss_pattern;
