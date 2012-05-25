# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table tick (
  id                        bigint not null,
  create_date               timestamp,
  message                   varchar(255),
  constraint pk_tick primary key (id))
;

create sequence tick_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists tick;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists tick_seq;

