INSERT INTO practicatest.`users` (id, username, password, register_date, role) VALUES ('1', 'munkatea', 'pass1', '2008-7-04', 'ADMIN');
INSERT INTO practicatest.`users` (id, username, password, register_date, role) VALUES ('2', 'bradpitt', 'pass2', '2020-4-14', 'RECRUITER');
INSERT INTO practicatest.`users` (id, username, password, register_date, role) VALUES ('3', 'qtarantino', 'pass3', '2018-7-03', 'RECRUITER');
INSERT INTO practicatest.`users` (id, username, password, register_date, role) VALUES ('4', 'enidelcu', 'pass4', '2021-12-02', 'APPLICANT');
INSERT INTO practicatest.`users` (id, username, password, register_date, role) VALUES ('5', 'ludmila', 'pass5', '2010-1-31', 'APPLICANT');
INSERT INTO practicatest.`users` (id, username, password, register_date, role) VALUES ('6', 'gnelli', 'pass6', '2017-10-15', 'APPLICANT');
INSERT INTO practicatest.`users` (id, username, password, register_date, role) VALUES ('7', 'iuco', 'pass7', '2023-1-01', 'RECRUITER');
INSERT INTO practicatest.`users` (id, username, password, register_date, role) VALUES ('8', 'vbostan', 'pass8', '2019-4-13', 'RECRUITER');
INSERT INTO practicatest.`users` (id, username, password, register_date, role) VALUES ('9', 'hlanda', 'pass9', '2020-3-11', 'RECRUITER');
INSERT INTO practicatest.`users` (id, username, password, register_date, role) VALUES ('10', 'oppenheimer', 'pass10', '2013-3-27', 'APPLICANT');
INSERT INTO practicatest.`users` (id, username, password, register_date, role) VALUES ('11', 'holmes', 'pass11', '2009-5-31', 'APPLICANT');

INSERT INTO practicatest.`companies` (id, title, domain, about, phone_number, email, img_path) VALUES ('1', 'IUCOSOFT', 'IT', 'We work in JAVA', '060111111', 'email@iucosoft.com', 'img1.jpg');
INSERT INTO practicatest.`companies` (id, title, domain, about, phone_number, email, img_path) VALUES ('2', 'ORATORICA', 'EDUCATION', 'Courses for learning new languages', '060222222', 'oratorica@gmail.com', 'img2.jpg');
INSERT INTO practicatest.`companies` (id, title, domain, about, phone_number, email, img_path) VALUES ('3', 'DECOR', 'DESIGN', 'Design for posters and wallpapers', '060333333', 'mail@decor.md', 'img3.jpg');
INSERT INTO practicatest.`companies` (id, title, domain, about, phone_number, email, img_path) VALUES ('4', 'TKD', 'SPORT_BEAUTY_WELLNESS', 'Taekwondo sport club', '060444444', 'sport@tkd.com', 'img4.jpg');
INSERT INTO practicatest.`companies` (id, title, domain, about, phone_number, email, img_path) VALUES ('5', 'Andy\'s Pizza', 'FOOD', 'Y\'all know what does our company =-)', '060555555', 'andys.pizza@gmail.com', 'img5.jpg');

INSERT INTO practicatest.`applicants` (id, name, surname, age, a_status, domain, cv, user_id, email, phone_number) VALUES ('1', 'Elena', 'Nidelcu', '19', 'STUDENT', 'IT', 'cv1.pdf', '4', 'elena.nidelcu@isa.utm.md', '060123456');
INSERT INTO practicatest.`applicants` (id, name, surname, age, a_status, domain, cv, user_id, email, phone_number) VALUES ('2', 'Ludmila', 'Friptu', '20', 'WORKING', 'EDUCATION', 'cv2.pdf', '5', 'friptu@gmail.com', '060234567');
INSERT INTO practicatest.`applicants` (id, name, surname, age, a_status, domain, cv, user_id, email, phone_number) VALUES ('3', 'Nelli', 'Garbuz', '18', 'STUDENT', 'DESIGN', 'cv3.pdf', '6', 'nelly@dip.utm.md', '060345678');
INSERT INTO practicatest.`applicants` (id, name, surname, age, a_status, domain, cv, user_id, email, phone_number) VALUES ('4', 'Robert', 'Oppenheimer', '40', 'WORKING', 'SPORT_BEAUTY_WELLNESS', 'cv4.pdf', '10', 'r.oppy@bomb.com', '060456789');
INSERT INTO practicatest.`applicants` (id, name, surname, age, a_status, domain, cv, user_id, email, phone_number) VALUES ('5', 'Sherlock', 'Holmes', '30', 'UNEMPLOYED', 'FOOD', 'cv5.pdf', '11', 'holmes@gmail.com', '060567890');

INSERT INTO practicatest.`recruiters` (id, name, surname, user_id, company_id, email) VALUES ('1', 'Brad', 'Pitt', '2', '4', 'brad.pitt@tkd.md');
INSERT INTO practicatest.`recruiters` (id, name, surname, user_id, company_id, email) VALUES ('2', 'Quentin', 'Tarantino', '3', '5', 'quentin.tarantino@andis.md');
INSERT INTO practicatest.`recruiters` (id, name, surname, user_id, company_id, email) VALUES ('3', 'Iurie', 'Corobceanu', '7', '1', 'iurie@iucosoft.com');
INSERT INTO practicatest.`recruiters` (id, name, surname, user_id, company_id, email) VALUES ('4', 'Viorel', 'Bostan', '8', '2', 'viorel.bostan@oratorica.com');
INSERT INTO practicatest.`recruiters` (id, name, surname, user_id, company_id, email) VALUES ('5', 'Hans', 'Landa', '9', '3', 'hans.landa@decor.md');

INSERT INTO practicatest.`programmes` (id, title, domain, start_data, duration, company_id, duties, qualifications, benefits, location, paid) VALUES ('1', 'JAVA Developer', 'IT', '2020-3-05', '3 months', '1', 'Develop desktop apps', 'Know JAVA well', 'Work remotely', 'ONLINE', '0');
INSERT INTO practicatest.`programmes` (id, title, domain, start_data, duration, company_id, duties, qualifications, benefits, location, paid) VALUES ('2', 'English teacher', 'EDUCATION', '2016-7-09', '2 months', '2', 'Teach children', 'C1 in English', 'Hiring after internship', 'Chisinau', '0');
INSERT INTO practicatest.`programmes` (id, title, domain, start_data, duration, company_id, duties, qualifications, benefits, location, paid) VALUES ('3', 'Designer', 'DESIGN', '2023-5-25', '6 months', '3', 'Design personalised posters', 'Studii la UTM', 'Working with us', 'Chisinau', '1');
INSERT INTO practicatest.`programmes` (id, title, domain, start_data, duration, company_id, duties, qualifications, benefits, location, paid) VALUES ('4', 'Coach', 'SPORT_BEAUTY_WELLNESS', '2022-8-27', '4 months', '4', 'Coach people', 'Maestru al Sportului', 'No benefits', 'Balti', '1');
INSERT INTO practicatest.`programmes` (id, title, domain, start_data, duration, company_id, duties, qualifications, benefits, location, paid) VALUES ('5', 'Cook', 'FOOD', '2021-2-14', '5 weeks', '5', 'Boil eggs', 'No qualifications', 'Eat eggs', 'Cantemir', '0');

INSERT INTO practicatest.`applications` (id, applicant_id, programme_id, application_date, cv, phone_number, email) VALUES ('1', '1', '1', '2023-10-10', 'cv1.pdf', '060123456', 'elena.nidelcu@isa.utm.md');
INSERT INTO practicatest.`applications` (id, applicant_id, programme_id, application_date, cv, phone_number, email) VALUES ('2', '2', '2', '2023-10-11', 'cv2.pdf', '060234567', 'friptu@gmail.com');
INSERT INTO practicatest.`applications` (id, applicant_id, programme_id, application_date, cv, phone_number, email) VALUES ('3', '3', '3', '2023-10-12', 'cv3.pdf', '060345678', 'nelly@dip.utm.md');
INSERT INTO practicatest.`applications` (id, applicant_id, programme_id, application_date, cv, phone_number, email) VALUES ('4', '4', '4', '2023-10-13', 'cv4.pdf', '060456789', 'r.oppy@bomb.com');
INSERT INTO practicatest.`applications` (id, applicant_id, programme_id, application_date, cv, phone_number, email) VALUES ('5', '5', '5', '2023-10-14', 'cv5.pdf', '060567890', 'holmes@gmail.com');