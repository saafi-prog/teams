/*
 * DML = Data Lanipulation Language
 * Command lines from 'teams-db' folder:
 * psql -h localhost -p 5432 -U postgres -d teams
 * \i data.dml.sql
 * \q
 */
INSERT INTO towns (zip_code, name) VALUES
	('93100', 'Montreuil');

INSERT INTO addresses (road, town_id) VALUES
	('14 Rue de la Beaune', (SELECT t.id FROM towns t WHERE t.zip_code = '93100'));
	
INSERT INTO teams (name) VALUES
	('Formateurs'), ('Pedagogique');
	
INSERT INTO members (first_name, last_name, home_address_id) VALUES
	('Jeremy', 'BOJKO', (SELECT t.id FROM addresses t WHERE t.road = '14 Rue de la Beaune')),
	('Frank', 'MARSHALL', (SELECT t.id FROM addresses t WHERE t.road = '14 Rue de la Beaune')),
	('Gloria', 'LUONG', (SELECT t.id FROM addresses t WHERE t.road = '14 Rue de la Beaune')),
	('Gilles', 'DAUGUET', (SELECT t.id FROM addresses t WHERE t.road = '14 Rue de la Beaune'));
	
INSERT INTO teams_members VALUES 
	((SELECT t.id FROM teams t WHERE t.name = 'Formateurs'), (SELECT t.id FROM members t WHERE t.last_name = 'BOJKO')),
	((SELECT t.id FROM teams t WHERE t.name = 'Formateurs'), (SELECT t.id FROM members t WHERE t.last_name = 'MARSHALL')),
	((SELECT t.id FROM teams t WHERE t.name = 'Pedagogique'), (SELECT t.id FROM members t WHERE t.last_name = 'LUONG')),
	((SELECT t.id FROM teams t WHERE t.name = 'Pedagogique'), (SELECT t.id FROM members t WHERE t.last_name = 'DAUGUET'));
