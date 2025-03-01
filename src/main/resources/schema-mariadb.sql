/**
 * Author:  Ariel
 * Created: Feb 28, 2025
 */
drop table if exists videogame;
drop table if exists distributor;


create table videogame (
    id int primary key auto_increment,
    name varchar(200) not null,
    description varchar(3000),
    imageURL varchar(500)
);

insert into videogame (id, name, description, imageURL) values
(1, "Subnautica", "The best diver games with bigger monster", "https://ariel-sportcommerce.s3.us-east-2.amazonaws.com/subnautica.jpg"),
(2, "Diabolic Hat", "U cant run from the hat, he will controll u", "https://ariel-sportcommerce.s3.us-east-2.amazonaws.com/cult+of+the+lamb.jpg"),
(3, "Cult Of the Lamb", "The best cult of animal with a evil contrast", "https://ariel-sportcommerce.s3.us-east-2.amazonaws.com/hat.jpg"),
(4, "EA", "Do sport in virtual better than real", "https://ariel-sportcommerce.s3.us-east-2.amazonaws.com/NIKE%2BREVOLUTION%2B7.png");


create table distributor (
    id int primary key auto_increment,
    name varchar(200) not null,
    web_site varchar(500)
);

insert into distributor(id, name, web_site) values
(1,     '2K',                           'https://2k.com'),
(2,     'Focus Home Interactive',       'https://www.focus-home.com'),
(3,     'Thekla',                       null),
(4,     'Number One',                   null),
(5,     '505 Games',                    'https://505games.com'),
(6,     'Unknown Worlds Entertainment', 'https://unknownworlds.com'),
(7,     'Campo Santo',                  'https://www.camposanto.com');


alter table videogame
add column distributor_id int,
add foreign key(distributor_id) references distributor(id);


update videogame set distributor_id = 1 where id in (1);
update videogame set distributor_id = 2 where id in (2);
update videogame set distributor_id = 3 where id in (3);
update videogame set distributor_id = 4 where id in (4);


alter table videogame
modify distributor_id int not null;
