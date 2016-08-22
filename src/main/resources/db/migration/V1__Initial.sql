drop table if exists category;
drop table if exists movie;

create table category (id bigint not null auto_increment, code integer not null, description varchar(255), primary key (id));
create table movie (id bigint not null auto_increment, copies_purchased integer not null, title varchar(255), description varchar(255), rating varchar(255), rental_price varchar(255), retail_price varchar(255), category_id bigint, primary key (id));
alter table movie add constraint fk_category_id foreign key (category_id) references category (id);