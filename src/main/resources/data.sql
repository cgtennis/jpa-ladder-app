
Insert season (season_name, start_date, end_date) values ('South Jersey Tennis Ladder 2023','2023-04-01','2023-09-30');

INSERT rating (rating,  rating_num) VALUES ('3.0',3.0);
INSERT rating (rating,  rating_num) VALUES ('3.5',3.5);
INSERT rating (rating,  rating_num) VALUES ('4.0',4.0);
INSERT rating (rating,  rating_num) VALUES ('4.5',4.5);
INSERT rating (rating,  rating_num) VALUES ('5.0',5.0);



INSERT player ( first_name, last_name, email, phone_number, rating, availability,location) VALUES ('Cheng','Wang','cg.tennis@gmail.com','(856)298-1112','4.5','Weekdays after 5pm, Weekend anytime','Atkinson');
INSERT player ( first_name, last_name, email, phone_number, rating, availability,location) VALUES ('Jeff','Tistan','jefftistan@gmail.com','(610)573-1109','4.0','Weekdays after 5pm','Atkinson');
INSERT player ( first_name, last_name, email, phone_number, rating, availability,location) VALUES ('John','Gundaker','jgundaker@hotmail.com','(609)707-5957','4.0','Weekdays after 530pm','Atkinson Anywhere');


INSERT  season_player (season_id, player_id) VALUES (1,1);
INSERT  season_player (season_id, player_id) VALUES (1,2);
INSERT  season_player (season_id, player_id) VALUES (1,3);


select CURDATE()