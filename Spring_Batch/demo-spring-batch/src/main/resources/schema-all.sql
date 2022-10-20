drop table persona IF exists;

create table persona(
id bigint identity not null primary key,
primer_nombre varchar(20),
segundo_nombre varchar(20),
telefono varchar(10)
);