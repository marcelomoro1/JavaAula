DROP DATABASE bdaula01;
CREATE DATABASE bdaula01;
CREATE TABLE pessoa (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    sexo CHAR(50) NOT NULL,
    idioma VARCHAR(50) NOT NULL
);

CREATE TABLE veiculo(
	id int auto_increment primary key,
    modelo varchar(30),
    placa varchar(7),
    id_pessoa int not null,
    foreign key (id_pessoa) references pessoa(id)
);



INSERT INTO pessoa (nome, sexo, idioma) VALUES
('Alice Silva', 'F', 'Português'),
('Bruno Souza', 'M', 'Inglês'),
('Carlos Oliveira', 'M', 'Espanhol'),
('Diana Costa', 'F', 'Francês'),
('Elias Santos', 'M', 'Alemão');

INSERT INTO veiculo (modelo, placa, id_pessoa) VALUES
('Fusca', 'ABC1D23', 1),  -- Alice
('Civic', 'XYZ4E56', 2),  -- Bruno
('Corolla', 'JKL7M89', 3), -- Carlos
('Focus', 'PQR0S12', 4),   -- Diana
('Gol', 'LMN3T45', 5);      -- Elias

SELECT * FROM VEICULO