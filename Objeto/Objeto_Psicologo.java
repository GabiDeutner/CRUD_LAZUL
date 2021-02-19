package Objeto;


public class Objeto_Psicologo {
    
    private int cd_Psicologo ;
    private int cd_SexoPsicologo;
    private String nm_Psicologo;
    private int nr_DDDpsicologo;
    private int nr_CRPpsicologo;
    private int nr_Telefonepsicologo;
    private String ds_emailPsicologo;
    private String nm_FaculdadePsicologo;
    private int dt_DataNascimentoPsi;
    private int nr_CPFpsicologo;
    private int nr_RGpsicologo;
    
    private String abr_Sexo;

    public int getCd_Psicologo() {
        return cd_Psicologo;
    }

    public void setCd_Psicologo(int cd_Psicologo) {
        this.cd_Psicologo = cd_Psicologo;
    }

    public int getCd_SexoPsicologo() {
        return cd_SexoPsicologo;
    }

    public void setCd_SexoPsicologo(int cd_SexoPsicologo) {
        this.cd_SexoPsicologo = cd_SexoPsicologo;
    }

    public String getNm_Psicologo() {
        return nm_Psicologo;
    }

    public void setNm_Psicologo(String nm_Psicologo) {
        this.nm_Psicologo = nm_Psicologo;
    }

    public int getNr_DDDpsicologo() {
        return nr_DDDpsicologo;
    }

    public void setNr_DDDpsicologo(int nr_DDDpsicologo) {
        this.nr_DDDpsicologo = nr_DDDpsicologo;
    }

    public int getNr_CRPpsicologo() {
        return nr_CRPpsicologo;
    }

    public void setNr_CRPpsicologo(int nr_CRPpsicologo) {
        this.nr_CRPpsicologo = nr_CRPpsicologo;
    }

    public int getNr_Telefonepsicologo() {
        return nr_Telefonepsicologo;
    }

    public void setNr_Telefonepsicologo(int nr_Telefonepsicologo) {
        this.nr_Telefonepsicologo = nr_Telefonepsicologo;
    }

    public String getDs_emailPsicologo() {
        return ds_emailPsicologo;
    }

    public void setDs_emailPsicologo(String ds_emailPsicologo) {
        this.ds_emailPsicologo = ds_emailPsicologo;
    }

    public String getNm_FaculdadePsicologo() {
        return nm_FaculdadePsicologo;
    }

    public void setNm_FaculdadePsicologo(String ds_FaculdadePsicologo) {
        this.nm_FaculdadePsicologo = ds_FaculdadePsicologo;
    }

    public int getDt_DataNascimentoPsi() {
        return dt_DataNascimentoPsi;
    }

    public void setDt_DataNascimentoPsi(int nr_DataNascimentoPsi) {
        this.dt_DataNascimentoPsi = nr_DataNascimentoPsi;
    }

    public int getNr_CPFpsicologo() {
        return nr_CPFpsicologo;
    }

    public void setNr_CPFpsicologo(int nr_CPFpsicologo) {
        this.nr_CPFpsicologo = nr_CPFpsicologo;
    }

    public int getNr_RGpsicologo() {
        return nr_RGpsicologo;
    }

    public void setNr_RGpsicologo(int nr_RGpsicologo) {
        this.nr_RGpsicologo = nr_RGpsicologo;
    }



    public String getAbr_Sexo() {
        return abr_Sexo;
    }

    public void setAbr_Sexo(String abr_Sexo) {
        this.abr_Sexo = abr_Sexo;
    }
    
    public boolean isNm_Psicologo_Valida() {
        boolean saida=false;
        if(this.nm_Psicologo.length()<=30) {
            saida=true;
        }
        return saida;
    }
    
    public boolean isNm_FaculdadePsicologo_Valida() {
        boolean saida=false;
        if(this.nm_FaculdadePsicologo.length()<=30) {
            saida=true;
        }
        return saida;
    }
    
    public boolean isDs_emailPsicologo_Valida() {
        boolean saida=false;
        if(this.ds_emailPsicologo.length()<=30) {
            saida=true;
        }
         int posArroba = ds_emailPsicologo.indexOf('@'); // para saber onde está o arroba do email
        //checagem dos domínios válidos
        //fim do email não pode ser diferente destes tipos, pois se for diferente é inválido
        if  ((!ds_emailPsicologo.endsWith(".gov.br"))&&
             (!ds_emailPsicologo.endsWith(".com.br"))&&
             (!ds_emailPsicologo.endsWith(".com"))){
            saida = false;
        }
        //email não pode começar com caracteres especiais
        if ((this.ds_emailPsicologo.startsWith("_"))||(this.ds_emailPsicologo.startsWith("#"))||(this.ds_emailPsicologo.startsWith("&"))){
            
        }
        return saida;
    }
}
