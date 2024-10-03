CREATE DATABASE bdaula01;
USE bdaula01;

CREATE TABLE PESSOA (
id INT auto_increment primary key,
nome VARCHAR (50) not null,
sexo VARCHAR(50) not null,
idioma VARCHAR (50) not null
);

INSERT INTO PESSOA (nome, sexo, idioma)
VALUES 
('Gerald', 'M', 'Inglês'),
('William', 'M', 'Inglês'),
('Umberto', 'M', 'Espanhol'),
('Jostein', 'M', 'Alemão'),
('Stephen', 'M', 'Holandês');

SELECT * FROM PESSOA

