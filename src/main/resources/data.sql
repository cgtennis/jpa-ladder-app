INSERT INTO tennis_ladder.tblRating (rating,  ratingNum) VALUES ('3.0',3.0);
INSERT INTO tennis_ladder.tblRating (rating,  ratingNum) VALUES ('3.5',3.5);
INSERT INTO tennis_ladder.tblRating (rating,  ratingNum) VALUES ('4.0',4.0);
INSERT INTO tennis_ladder.tblRating (rating,  ratingNum) VALUES ('4.5',4.5);
INSERT INTO tennis_ladder.tblRating (rating,  ratingNum) VALUES ('5.0',5.0);



INSERT INTO tennis_ladder.tblPlayer ( firstName, lastName, email, phoneNumber, rating, availability,location) VALUES ('Cheng','Wang','cg.tennis@gmail.com','(856)298-1112','4.5','Weekdays after 5pm, Weekend anytime','Atkinson');
INSERT INTO tennis_ladder.tblPlayer ( firstName, lastName, email, phoneNumber, rating, availability,location) VALUES ('Jeff','Tistan','jefftistan@gmail.com','(610)573-1109','4.0','Weekdays after 5pm','Atkinson');
INSERT INTO tennis_ladder.tblPlayer ( firstName, lastName, email, phoneNumber, rating, availability,location) VALUES ('John','Gundaker','jgundaker@hotmail.com','(609)707-5957','4.0','Weekdays after 530pm','Atkinson Anywhere');



select CURDATE()