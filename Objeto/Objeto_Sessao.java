package Objeto;


public class Objeto_Sessao {
    
    private int cd_Sessao;
    private int cd_SessaoPaciente;
    private int cd_SessaoPsicologo;
    private int cd_SessaoPagamento;
    
    private int dt_sessao;
    private int hr_InicioSessao;
    private int hr_TerminoSessao;
    private String vlr_Sessao;
    
    private String abr_pagamento;
    private String nm_paciente;
    private String nm_Psicologo;
    
    
    public int getCd_SessaoPaciente() {
        return cd_SessaoPaciente;
    }

    public void setCd_SessaoPaciente(int cd_SessaoPaciente) {
        this.cd_SessaoPaciente = cd_SessaoPaciente;
    }

    public int getCd_SessaoPsicologo() {
        return cd_SessaoPsicologo;
    }

    public void setCd_SessaoPsicologo(int cd_SessaoPsicologo) {
        this.cd_SessaoPsicologo = cd_SessaoPsicologo;
    }
    

    public String getNm_paciente() {
        return nm_paciente;
    }

    public void setNm_paciente(String nm_paciente) {
        this.nm_paciente = nm_paciente;
    }

    public String getNm_Psicologo() {
        return nm_Psicologo;
    }

    public void setNm_Psicologo(String nm_Psicologo) {
        this.nm_Psicologo = nm_Psicologo;
    }

    public int getCd_Sessao() {
        return cd_Sessao;
    }

    public void setCd_Sessao(int cd_Sessao) {
        this.cd_Sessao = cd_Sessao;
    }

    public int getDt_sessao() {
        return dt_sessao;
    }

    public void setDt_sessao(int dt_sessao) {
        this.dt_sessao = dt_sessao;
    }

    public int getHr_InicioSessao() {
        return hr_InicioSessao;
    }

    public void setHr_InicioSessao(int hr_InicioSessao) {
        this.hr_InicioSessao = hr_InicioSessao;
    }

    public int getHr_TerminoSessao() {
        return hr_TerminoSessao;
    }

    public void setHr_TerminoSessao(int hr_TerminoSessao) {
        this.hr_TerminoSessao = hr_TerminoSessao;
    }

    public String getVlr_Sessao() {
        return vlr_Sessao;
    }

    public void setVlr_Sessao(String vlr_Sessao) {
        this.vlr_Sessao = vlr_Sessao;
    }

    public String getAbr_pagamento() {
        return abr_pagamento;
    }

    public void setAbr_pagamento(String abr_pagamento) {
        this.abr_pagamento = abr_pagamento;
    }


    public int getCd_SessaoPagamento() {
        return cd_SessaoPagamento;
    }

    public void setCd_SessaoPagamento(int cd_SessaoPagamento) {
        this.cd_SessaoPagamento = cd_SessaoPagamento;
    }
    
    
    
    public boolean isVlr_Sessao_Valida() {
        boolean saida=false;
        if(this.vlr_Sessao.length()<=30) {
            saida=true;
        }
        return saida;
    }
   
   
    
}
