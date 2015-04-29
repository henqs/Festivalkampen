# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table quiz_question (
  question_id               integer auto_increment not null,
  question                  varchar(255),
  constraint pk_quiz_question primary key (question_id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table quiz_question;

SET FOREIGN_KEY_CHECKS=1;

