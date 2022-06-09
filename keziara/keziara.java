
/**
 *
 * @author Kezia
 * 

create database keziara;

create table Medico (
    idmedico int primary key,
    Nome varchar(100),
    Especialidade int,
    CRM int,
    CPF varchar(100)
);

create table Paciente(
    idpaciente int primary key,
    Nome varchar(100),
    CPF varchar(100),
    idade int
);

create table Consulta(
    idconsulta int primary key,
    id_medico int,
    id_paciente int,
    convenio varchar(100)
);

ALTER TABLE Consulta ADD CONSTRAINT id_medico FOREIGN KEY ( id_medico ) REFERENCES Medico ( idmedico ) ;
ALTER TABLE Consulta ADD CONSTRAINT id_paciente FOREIGN KEY ( id_paciente ) REFERENCES Paciente ( idpaciente ) ;

 */


