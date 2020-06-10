alter table floss add name nvarchar(255);

create or replace view floss_vw as select * from floss;

create or replace view floss_inventory_vw as select * from floss_inventory;

create or replace view pattern_vw as select * from pattern;

create or replace view pattern_size_vw as select * from pattern_size;

create or replace view pattern_floss_vw as select * from pattern_floss;
