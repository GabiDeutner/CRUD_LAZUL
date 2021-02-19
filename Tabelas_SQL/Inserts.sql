/* INSERTS */

INSERT INTO Sexo (nm_Sexo, abr_Sexo) VALUES ('Masculino', 'Mas')
INSERT INTO Sexo (nm_Sexo, abr_Sexo) VALUES ('Feminino', 'Fem')
INSERT INTO Sexo (nm_Sexo, abr_Sexo) VALUES ('Outros', 'Out')

INSERT INTO EstadoCivilPaciente (nm_EstadoCivilPaciente, abr_EstadoCivilPaciente) VALUES ('Casado', 'Cas')
INSERT INTO EstadoCivilPaciente (nm_EstadoCivilPaciente, abr_EstadoCivilPaciente) VALUES ('Divorciado', 'Div')
INSERT INTO EstadoCivilPaciente (nm_EstadoCivilPaciente, abr_EstadoCivilPaciente) VALUES ('Separado', 'Sep')
INSERT INTO EstadoCivilPaciente (nm_EstadoCivilPaciente, abr_EstadoCivilPaciente) VALUES ('Solteiro', 'Sol')
INSERT INTO EstadoCivilPaciente (nm_EstadoCivilPaciente, abr_EstadoCivilPaciente) VALUES ('Viuvo', 'Viu')


INSERT INTO Pagamento (tp_pagamento, abr_pagamento) VALUES ('Cartão de Crédito', 'CRE')
INSERT INTO Pagamento (tp_pagamento, abr_pagamento) VALUES ('Cartão de Débito', 'DEB')
INSERT INTO Pagamento (tp_pagamento, abr_pagamento) VALUES ('Transferência', 'TRA')
INSERT INTO Pagamento (tp_pagamento, abr_pagamento) VALUES ('Cheque', 'CHE')
INSERT INTO Pagamento (tp_pagamento, abr_pagamento) VALUES ('Dinheiro', 'DIN')
INSERT INTO Pagamento (tp_pagamento, abr_pagamento) VALUES ('Boleto', 'BOL')


INSERT INTO Paciente (nm_paciente, nr_DDDPaciente, nr_TelefonePaciente, dt_nascimentoPaciente, nr_CPFpaciente, nr_RGpaciente, cd_SexoPaciente, cd_EstCivilPaciente) VALUES ('Andreia', '11', '43677070', '20071989', '675937489', '784736981', '2', '1')
INSERT INTO Paciente (nm_paciente, nr_DDDPaciente, nr_TelefonePaciente, dt_nascimentoPaciente, nr_CPFpaciente, nr_RGpaciente, cd_SexoPaciente, cd_EstCivilPaciente) VALUES ('Joao', '11', '43677065', '03071973', '030719733', '123567467', '1', '2')
INSERT INTO Paciente (nm_paciente, nr_DDDPaciente, nr_TelefonePaciente, dt_nascimentoPaciente, nr_CPFpaciente, nr_RGpaciente, cd_SexoPaciente, cd_EstCivilPaciente) VALUES ('Maria', '11', '70704367', '20111990', '675489937', '769818473', '1', '5')



INSERT INTO Psicologo (nm_Psicologo , nr_CRPpsicologo, nr_DDDpsicologo, nr_Telefonepsicologo, ds_emailPsicologo, nm_FaculdadePsicologo, dt_DataNascimentoPsi, nr_CPFpsicologo, nr_RGpsicologo, cd_SexoPsicologo) VALUES ('Luana', '12345', '11', '70704367', 'luana@gmail.com', 'FATEC','01011980', '535678345', '634754321','1')
INSERT INTO Psicologo (nm_Psicologo , nr_CRPpsicologo, nr_DDDpsicologo, nr_Telefonepsicologo, ds_emailPsicologo, nm_FaculdadePsicologo, dt_DataNascimentoPsi, nr_CPFpsicologo, nr_RGpsicologo, cd_SexoPsicologo) VALUES ('Pedro', '13452', '11', '70677043', 'pedro@gmail.com', 'USP','01081987', '583453567', '633214754','2')
INSERT INTO Psicologo (nm_Psicologo , nr_CRPpsicologo, nr_DDDpsicologo, nr_Telefonepsicologo, ds_emailPsicologo, nm_FaculdadePsicologo, dt_DataNascimentoPsi, nr_CPFpsicologo, nr_RGpsicologo, cd_SexoPsicologo) VALUES ('Leticia', '45412', '11', '70367704', 'leticia@gmail.com', 'FATEC','15111992', '834535675', '754363421','3')



INSERT INTO Sessao (dt_sessao, hr_InicioSessao, hr_TerminoSessao, vlr_Sessao, cd_SessaoPsicologo, cd_SessaoPaciente, cd_SessaoPagamento) VALUES ('20012021', '11', '12', '120,00', '1', '2', '1')
INSERT INTO Sessao (dt_sessao, hr_InicioSessao, hr_TerminoSessao, vlr_Sessao, cd_SessaoPsicologo, cd_SessaoPaciente, cd_SessaoPagamento) VALUES ('15122020', '15', '16', '125,00', '3', '1', '5')
INSERT INTO Sessao (dt_sessao, hr_InicioSessao, hr_TerminoSessao, vlr_Sessao, cd_SessaoPsicologo, cd_SessaoPaciente, cd_SessaoPagamento) VALUES ('05122020', '20', '21', '130,00', '2', '3', '2')