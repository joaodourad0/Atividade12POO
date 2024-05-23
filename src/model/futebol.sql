CREATE DATABASE futebol;

USE futebol;

CREATE TABLE Time (
    Codigo INT PRIMARY KEY,
    nome VARCHAR(50),
    cidade VARCHAR(80)
);

CREATE TABLE Jogador (
    id INT PRIMARY KEY,
    nome VARCHAR(100),
    data_nasc DATE,
    altura DECIMAL(5, 2),
    peso DECIMAL(5, 2),
    TimeCodigo INT,
    FOREIGN KEY (TimeCodigo) REFERENCES Time(Codigo)
);