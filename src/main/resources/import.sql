insert into company values(1, 'Red company');
insert into company values(2, 'Blue company');

insert into users values(3, 'krzysztof@test.pl', 'Krzysztof', 1);
insert into users values(4, 'peter@test.pl', 'Peter', 1);
insert into users values(5, 'meg@test.pl', 'Meg', 2);
insert into users values(6, 'lois@test.pl', 'Lois', 2);
insert into users values(7, 'stewie@test.pl', 'Stewie', null);

insert into product values(10, 'a1', 'Bread');
insert into product values(11, 'a2', 'Carrot');
insert into product values(12, 'a3', 'Apple');
insert into product values(13, 'a4', 'Pan');

insert into users_products values(3, 10);
insert into users_products values(3, 11);
insert into users_products values(3, 12);
insert into users_products values(3, 13);
insert into users_products values(4, 13);
insert into users_products values(7, 12);
insert into users_products values(7, 11);
