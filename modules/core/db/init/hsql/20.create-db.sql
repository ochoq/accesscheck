-- begin ACCESSCHECK_C
alter table ACCESSCHECK_C add constraint FK_ACCESSCHECK_C_ON_A foreign key (A_ID) references ACCESSCHECK_A(ID)^
create index IDX_ACCESSCHECK_C_ON_A on ACCESSCHECK_C (A_ID)^
-- end ACCESSCHECK_C
