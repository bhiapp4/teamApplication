CREATE TABLE `teams` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `rating` int(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

create table users(
	username varchar(100) not null primary key,
	password varchar(100) not null,
    enabled boolean not null
);

create table authorities(
	username varchar(100) not null,
	authority varchar(50) not null,
	constraint fk_authorities_users
	foreign key(username) references users(username)
);
create unique index idx_of_username on authorities(username, authority); 

insert into users values('jim','secret',true);

insert into authorities values('jim','ROLE_USER');
