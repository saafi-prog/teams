/*
 * DDL = Data Definition Language
 * Command lines from 'teams-db' folder:
 * psql -h localhost -p 5432 -U postgres -d teams
 * \i schema.ddl.sql
 * \q
 */
CREATE TABLE towns (  
	id SERIAL PRIMARY KEY,  
	zip_code varchar(10) UNIQUE NOT NULL,  
	name varchar(200) NOT NULL
);

CREATE TABLE addresses (  
	id SERIAL PRIMARY KEY,  
	road varchar(200) NOT NULL,
	town_id INTEGER NOT NULL,
	CONSTRAINT fk_town_id
    	FOREIGN KEY (town_id)
    	REFERENCES towns(id)
);

CREATE TABLE teams (  
	id SERIAL PRIMARY KEY,   
	name varchar(50) UNIQUE NOT NULL
);

CREATE TABLE members (  
	id SERIAL PRIMARY KEY,  
	first_name varchar(255) NOT NULL,
	last_name varchar(255) NOT NULL,
	home_address_id INTEGER NOT NULL,
	CONSTRAINT fk_home_address_id
    	FOREIGN KEY (home_address_id)
    	REFERENCES addresses(id)
);

CREATE TABLE teams_members (  
	team_id INTEGER,
	member_id INTEGER,
  	PRIMARY KEY (team_id, member_id),
  	CONSTRAINT fk_team_id
    	FOREIGN KEY(team_id)
    	REFERENCES teams(id),
  	CONSTRAINT fk_member_id
    	FOREIGN KEY (member_id)
    	REFERENCES members(id)
);
