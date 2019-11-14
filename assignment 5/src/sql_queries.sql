create database playerdata;
use playerdata;
create table Country(
CountryID int,
CountryName varchar(255)
);

insert into Country(CountryID,CountryName)
Values (1,'India'),
	   (2,'Italy'),
	   (3,'Sri Lanka'),
	   (4,'Australia'),
	   (5,'South Africa');
create table Players(
	playerID int,
	countryID int,
	PlayerName varchar(255),
	RunsMade int,
	WicketTaken int
	);
alter table Country
add primary key (CountryID);
insert into Players(playerID,countryID,PlayerName,RunsMade,WicketTaken)
Values  (1,1,'dhoni',25,5),
        (2,1,'tendulkar',100,15),
		(3,2,'john walt',20,13),
		(4,2,'david k',500,16),
		(5,2,'alice m',800,17),
		(6,3,'surya',200,20),
		(7,3,'mithun',600,30),
		(8,4,'gale',80,6),
		(9,4,'kwisk',90,9),
		(10,4,'marget',95,8);
select playerName from players
where RunsMade>=100 && WicketTaken>=15;
alter table players
add foreign key (countryID) references Country(CountryID);
delete from Country
where CountryID not in (select countryID from players);
update players
set RunsMade=RunsMade+5
where WicketTaken>=20;
select * from players;