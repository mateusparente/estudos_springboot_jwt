INSERT INTO USUARIO (USUARIO_ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ENABLED, LASTPASSWORDRESETDATE) VALUES (100, 'admin', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', 'admin', 'admin', 'admin@admin.com', 1, PARSEDATETIME('01-01-2016', 'dd-MM-yyyy'));
INSERT INTO USUARIO (USUARIO_ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ENABLED, LASTPASSWORDRESETDATE) VALUES (200, 'user', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'enabled@user.com', 1, PARSEDATETIME('01-01-2016','dd-MM-yyyy'));
INSERT INTO USUARIO (USUARIO_ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ENABLED, LASTPASSWORDRESETDATE) VALUES (300, 'disabled', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'disabled@user.com', 0, PARSEDATETIME('01-01-2016','dd-MM-yyyy'));

INSERT INTO AUTHORITY (ID, NAME) VALUES (1, 'ROLE_USER');
INSERT INTO AUTHORITY (ID, NAME) VALUES (2, 'ROLE_ADMIN');

INSERT INTO USER_AUTHORITY (USUARIO_ID, AUTHORITY_ID) VALUES (100, 1);
INSERT INTO USER_AUTHORITY (USUARIO_ID, AUTHORITY_ID) VALUES (100, 2);
INSERT INTO USER_AUTHORITY (USUARIO_ID, AUTHORITY_ID) VALUES (200, 1);
INSERT INTO USER_AUTHORITY (USUARIO_ID, AUTHORITY_ID) VALUES (300, 1);

INSERT INTO HORAS_USUARIO (HORA_ID, DIA, HORAS, USUARIO_ID) VALUES (0, '2018-03-26', 8, 100);