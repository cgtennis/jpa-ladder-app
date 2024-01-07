-- noinspection SqlNoDataSourceInspectionForFile

Insert seasons (season_name, start_date, end_date) values ('South Jersey Tennis Ladder 2023','2023-04-01','2023-09-30');

INSERT ratings (rating_code,  rating_num) VALUES ('3.0',3.0);
INSERT ratings (rating_code,  rating_num) VALUES ('3.5',3.5);
INSERT ratings (rating_code,  rating_num) VALUES ('4.0',4.0);
INSERT ratings (rating_code,  rating_num) VALUES ('4.5',4.5);
INSERT ratings (rating_code,  rating_num) VALUES ('5.0',5.0);



INSERT players ( first_name, last_name, email, phone_number, rating_code, gender, availability,location) VALUES ('Cheng','Wang','cg.tennis@gmail.com','(856)298-1112','4.5','M','Weekdays after 5pm, Weekend anytime','Atkinson');
INSERT players ( first_name, last_name, email, phone_number, rating_code, gender, availability,location) VALUES ('Jeff','Tistan','jefftistan@gmail.com','(610)573-1109','3.5','M','Weekdays after 5pm','Atkinson');
INSERT players ( first_name, last_name, email, phone_number, rating_code, gender, availability,location) VALUES ('John','Gundaker','jgundaker@hotmail.com','(609)707-5957','4.0','M','Weekdays after 530pm','Atkinson Anywhere');


INSERT  season_players (season_id, player_id) VALUES (1,1);
INSERT  season_players (season_id, player_id) VALUES (1,2);
INSERT  season_players (season_id, player_id) VALUES (1,3);


insert matches (season_id, winner_id, loser_id,match_date,set1_score,set2_score,set3_score) values (1,1,2,'2023-8-8','6-0','6-0',null);
insert matches (season_id, winner_id, loser_id,match_date,set1_score,set2_score,set3_score) values (1,1,2,'2023-7-18','6-1','6-2',null);
insert matches (season_id, winner_id, loser_id,match_date,set1_score,set2_score,set3_score) values (1,1,3,'2023-9-10','6-3','6-0',null);
insert matches (season_id, winner_id, loser_id,match_date,set1_score,set2_score,set3_score) values (1,3,2,'2023-9-12','6-4','6-4',null);

select CURDATE()