use LAZUL

CREATE TABLE Sexo (
	
	cd_Sexo 			int 				not null 	identity(1,1),
	nm_Sexo 			varchar(10) 		not null,
	abr_Sexo 			char(3) 			not null,
	CONSTRAINT pk_Sexo PRIMARY KEY (cd_Sexo) 
)


CREATE TABLE EstadoCivilPaciente (
	
	cd_EstadoCivilPaciente 			int 				not null 	identity(1,1),
	nm_EstadoCivilPaciente 			varchar(10) 		not null,
	abr_EstadoCivilPaciente 		char(3) 			not null,
	CONSTRAINT pk_EstadoCivilPaciente PRIMARY KEY (cd_EstadoCivilPaciente) 
)



Create table Paciente (
	cd_paciente				int				not null identity(1,1),
	nm_paciente				varchar(30)		not null,
	nr_DDDPaciente			int				not null,
	nr_TelefonePaciente		int				not null,
	dt_nascimentoPaciente	int				not null,
	nr_CPFpaciente			int				not null,
	nr_RGpaciente			int				not null,
	cd_EstCivilPaciente		int				not null,
	cd_SexoPaciente			int				not null,
	CONSTRAINT pk_paciente					PRIMARY KEY (cd_paciente),
	CONSTRAINT fk_Paciente_Sexo				FOREIGN KEY (cd_SexoPaciente) REFERENCES Sexo (cd_Sexo),
	CONSTRAINT fk_Paciente_EstadoCivil		FOREIGN KEY (cd_EstCivilPaciente) REFERENCES EstadoCivilPaciente (cd_EstadoCivilPaciente)
) -- fim da table Paciente






CREATE TABLE Psicologo (
	
	cd_Psicologo 			int 			not null 	identity(1,1),
	nm_Psicologo 			varchar(30) 	not null,
	nr_CRPpsicologo 		int 			not null,
	nr_DDDpsicologo 		int 			not null,
	nr_Telefonepsicologo 	int 			not null,
	ds_emailPsicologo 		varchar(30) 	not null,
	nm_FaculdadePsicologo 	varchar(30) 	not null,
	dt_DataNascimentoPsi 	int 			not null,
	nr_CPFpsicologo 		int 			not null,
	nr_RGpsicologo 			int 			not null,
	cd_SexoPsicologo		int 			not null,
	CONSTRAINT pk_Psicologo PRIMARY KEY (cd_Psicologo), 
	CONSTRAINT fk_Psicologo_Sexo FOREIGN KEY (cd_SexoPsicologo) REFERENCES Sexo (cd_Sexo)
)





Create table Pagamento (
	cd_Pagamento			int				not null identity(1,1),
	tp_pagamento			varchar(30)		not null,
	abr_pagamento			varchar(3) 			not null,
	CONSTRAINT pk_Pagamento PRIMARY KEY (cd_Pagamento),
) --fim da table PagamentoSessao





CREATE TABLE Sessao (
	
	cd_Sessao				int		not null	identity(1,1),
	dt_sessao				int		not null,
	hr_InicioSessao			int		not null,
	hr_TerminoSessao		int		not null,
	vlr_Sessao				varchar(10)		not null,
	cd_SessaoPsicologo		int 	not null,
	cd_SessaoPaciente		int 	not null,
	cd_SessaoPagamento		int 	not null,
	CONSTRAINT pk_Sessao PRIMARY KEY (cd_Sessao), 
	CONSTRAINT fk_Sessao_Psicologo FOREIGN KEY (cd_SessaoPsicologo) REFERENCES Psicologo (cd_Psicologo),
	CONSTRAINT fk_Sessao_Paciente FOREIGN KEY (cd_SessaoPaciente) REFERENCES Paciente (cd_paciente),
	CONSTRAINT fk_Sessao_Pagamento FOREIGN KEY (cd_SessaoPagamento) REFERENCES Pagamento (cd_Pagamento)
)






