# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table quiz (
  id                        integer auto_increment not null,
  title                     varchar(255),
  constraint pk_quiz primary key (id))
;

create table quiz_question (
  question_id               integer auto_increment not null,
  question                  varchar(255),
  constraint pk_quiz_question primary key (question_id))
;

create table quiz_question_choice (
  choice_id                 integer auto_increment not null,
  question_id               integer,
  is_right_choice           tinyint,
  choice                    varchar(255),
  constraint pk_quiz_question_choice primary key (choice_id))
;

create table quiz_user_answer (
  user_id                   bigint,
  question_id               integer,
  choice_id                 integer,
  is_right                  tinyint,
  answer_time               datetime)
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table quiz;

drop table quiz_question;

drop table quiz_question_choice;

drop table quiz_user_answer;

SET FOREIGN_KEY_CHECKS=1;

