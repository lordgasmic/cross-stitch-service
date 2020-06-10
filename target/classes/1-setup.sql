create user 'xstitch_appl'@'localhost' identified by 'xstitch_appl_password';

create table floss (
    id int not null auto_increment primary key,
    brand nvarchar(255),
    color_code int,
    length nvarchar(255),
    thread_count int
);

create table floss_inventory (
    fid int not null,
    length nvarchar(255),
    skein nvarchar(255)
);

create table pattern (
    id int not null auto_increment primary key,
    name nvarchar(255),
    brand nvarchar(255)
);

create table pattern_size (
    pid int not null,
    size int,
    height nvarchar(255),
    width nvarchar(255)
);

create table pattern_floss (
    pid int not null,
    fid int not null,
    stitches int,
    skein nvarchar(255)
);

create or replace view floss_vw as select * from floss;
grant select, insert, update, delete on web.floss_vw to 'xstitch_appl'@'localhost';

create or replace view floss_inventory_vw as select * from floss_inventory;
grant select, insert, update, delete on web.floss_inventory_vw to 'xstitch_appl'@'localhost';

create or replace view pattern_vw as select * from pattern;
grant select, insert, update, delete on web.pattern_vw to 'xstitch_appl'@'localhost';

create or replace view pattern_size_vw as select * from pattern_size;
grant select, insert, update, delete on web.pattern_size_vw to 'xstitch_appl'@'localhost';

create or replace view pattern_floss_vw as select * from pattern_floss;
grant select, insert, update, delete on web.pattern_floss_vw to 'xstitch_appl'@'localhost';

create index floss_color_code_idx on floss (color_code(4));
