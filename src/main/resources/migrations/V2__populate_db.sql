INSERT INTO client (NAME) VALUES
('James Bond'),
('Mary Blood'),
('Olena Teliga'),
('Taras Marks'),
('Karl Jonson'),
('Blade Fox'),
('Vitaliy Peper'),
('Jane Sanders'),
('Michael Rodriges'),
('Mira Mirage');

INSERT INTO planet (ID, NAME) VALUES
('EAR','Earth'),
('MARS', 'Mars'),
('JUP', 'Jupiter'),
('VEN', 'Venus'),
('SAT', 'Saturn');

INSERT INTO ticket (CREATED_AT, CLIENT_ID, FROM_PLANET_ID, TO_PLANET_ID) VALUES
('2024-01-10  09:22:38',1,'EAR','VEN'),
('2024-01-15  02:12:38',2,'EAR','MARS'),
('2024-01-20  20:08:12',3,'EAR','JUP'),
('2024-01-25  11:45:08',4,'EAR','SAT'),
('2024-01-27  19:13:55',5,'MARS','VEN'),
('2024-02-05  17:59:59',6,'JUP','EAR'),
('2024-02-12  04:24:48',7,'SAT','MARS'),
('2024-02-24  16:02:18',8,'VEN','SAT'),
('2024-03-06  03:29:08',9,'VEN','JUP'),
('2024-03-17  07:46:20',10,'JUP','SAT');