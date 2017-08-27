DROP TABLE IF EXISTS  app_activity_log;
CREATE TABLE  app_activity_log (
  log_id INTEGER PRIMARY KEY auto_increment ,
  username VARCHAR(45),
  user_ip VARCHAR(45),
  photos_sent VARCHAR(100),
  date_accessed DATE);

DROP TABLE IF EXISTS  images;
CREATE TABLE  images (
  image_id  INTEGER PRIMARY KEY AUTO_INCREMENT,
  filename VARCHAR(100),
  date_recorded DATETIME,
  username VARCHAR(45),
  user_ip VARCHAR(45));

INSERT INTO app_activity_log VALUES(default,'user',null,'none',sysdate);

insert into images (filename, date_recorded, username)
values ('1.jpg','2017-07-09T00:00:00','hjbello');

select * from app_activity_log;

select * from images;