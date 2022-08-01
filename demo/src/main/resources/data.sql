INSERT INTO address(id,city,street_name,street_no,building)
VALUES
(1,'Craiova','1 Mai',5,'182'),
(2,'Craiova','Tufanele',4,'18'),
(3,'Craiova','Toporasi',2,'8'),
(4,'Craiova','Calea Bucuresti',8,'12'),
(5,'Craiova','Calea Severinului',12,'1E'),
(6,'Craiova','Caracal',15,'2T'),
(7,'Craiova','Spaniei',5,'1B'),
(8,'Craiova','Calea Bucuresti',3,'5D'),
(9,'Craiova','Anul 1848',1,'2C'),
(10,'Craiova','Albastrele',3,'7F'),
(11,'Craiova','Calea Bucuresti',8,'200A'),
(12,'Craiova','Calea Severinului',2,'7G'),
(13,'Craiova','Grigore Gabrielescu',15,'3E'),
(14,'Craiova','Elena Farago',11,'6A'),
(15,'Craiova','Constantin Brincoveanu',4,'10E'),
(16,'Craiova','Maria Tanase',6,'11A'),
(17,'Craiova','Calea Severinului',3,'12D'),
(18,'Craiova','1 Mai',2,'5A'),
(19,'Craiova','George Enescu',8,'3C'),
(20,'Craiova','bulevardul Dacia',4,'2A');

INSERT INTO person(id,age,last_name,first_name,address_id)
VALUES(1,18,'Stefan', 'Popa',1),
(2,18,'Elena', 'Popa',2),
(3,17,'Roxana', 'Popescu',3),
(4,18,'Marian', 'Georgescu',4),
(5,18,'Robert', 'Andreescu',5),
(6,18,'Andrei', 'Enescu',6),
(7,19,'Razvan', 'Tudor',7),
(8,17,'George', 'Mihai',8),
(9,17,'Andreea', 'Andrei',9),
(10,17,'Stefania', 'Gheorghe',10),
(11,14,'Diana', 'Florescu',11),
(12,15,'Simona', 'Dumitru',12),
(13,15,'Raluca', 'Dumitrescu',13),
(14,15,'Stefan', 'Ionescu',14),
(15,14,'Andreea', 'Ion',15),
(16,14,'Gabriel', 'Albu',16),
(17,14,'Alexandra', 'Andru',17),
(18,14,'Alexandru', 'Popa',18),
(19,15,'Iulia', 'Botea',19),
(20,15,'Iulian', 'Tinca',20),
(21,39,'Daniel', 'Rotaru',1),
(22,45,'Ioana', 'Anghel',2),
(23,40,'Alina', 'Dumitru',3),
(24,39,'Bogdan', 'Cristinel',4),
(25,48,'Mihai', 'Olaru',5),
(26,44,'Roberta', 'Casian',6),
(27,38,'Daniela', 'Casandru',7),
(28,44,'Robert', 'Alberto',1),
(29,41,'Andreea', 'Dica',2),
(30,37,'Roxana', 'Dinca',3);

INSERT INTO classroom(id,name)
VALUES (1,'12A'),
(2,'9A');

INSERT INTO student(id,cnp,classroom_id,person_id)
VALUES
(1,'1041006163358',1,1),
(2,'2040524165584',1,2),
(3,'2051016162536',1,3),
(4,'1040210163536',1,4),
(5,'1040105163639',1,5),
(6,'1040201163231',1,6),
(7,'1030303160502',1,7),
(8,'1050402165521',1,8),
(9,'2050410167874',1,9),
(10,'2050506168845',1,10),
(11,'2080614165541',2,11),
(12,'2070715162520',2,12),
(13,'2070711161142',2,13),
(14,'1070801164541',2,14),
(15,'2080816162510',2,15),
(16,'1080928160038',2,16),
(17,'2081102165163',2,17),
(18,'1081210165974',2,18),
(19,'2071220165244',2,19),
(20,'1071011161119',2,20);


INSERT INTO subject(id,name)
VALUES(1,'Romana'),
(2,'Matematica'),
(3,'Geografie'),
(4,'Engleza'),
(5,'Istorie'),
(6,'Chimie'),
(7,'Biologie');

INSERT INTO teacher(id,classroom_id,subject_id,person_id)
VALUES
(1,1,1,21),
(2,1,2,22),
(3,1,3,23),
(4,1,4,24),
(5,1,5,25),
(6,2,6,26),
(7,2,1,27),
(8,2,2,28),
(9,2,3,29),
(10,2,4,30);
