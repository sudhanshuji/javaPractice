 create database player_db;
 use player_db;
 create table Team(
    -> Team_Id int primary key,
    -> Team_Name varchar(6) NOT NULL);

    insert into Team
     Values (1,'CSK'),
     		(2,'RCB'),
     		(3,'MI'),
     		(4,'RR'),
     		(5,'SRH'),
     		(6,'KKR');

 create table Player(
 Player_No int  Auto_increment,
 Player_Name varchar(20) not null,
 Category varchar(20) check(Category IN('batsman','bowler','Allrounder')),
 HighestScore int,
 BestFigure varchar(10) check(BestFigure Like '%/%'),
 primary key(Player_No));

 create table Team_Player(
 Player_No int,
 Team_Id int,
 Foreign key (Player_No) references Player(Player_No),
 Foreign key (Team_Id) references Team(Team_Id));

 insert into Player
 Values (?,?,?,?);

select player_no from team_player tp inner join team t on tp.team_id=t.team_id where team_name = 'CSK';
 select player_name,category from player where player_no IN (select player_no from team_player tp inner join team t on tp.team_id=t.team_id where team_name = 'MI');
