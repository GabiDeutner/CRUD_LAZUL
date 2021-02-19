
package Objeto;


public class Objeto_Sexo {
    
    private int cd_Sexo;

    public void setCd_Sexo(int cd_Sexo) {
        this.cd_Sexo = cd_Sexo;
    }

    public void setNm_Sexo(String nm_Sexo) {
        this.nm_Sexo = nm_Sexo;
    }

    public void setAbr_Sexo(String abr_Sexo) {
        this.abr_Sexo = abr_Sexo;
    }

    public int getCd_Sexo() {
        return cd_Sexo;
    }

    public String getNm_Sexo() {
        return nm_Sexo;
    }

    public String getAbr_Sexo() {
        return abr_Sexo;
    }
    private String nm_Sexo;
    private String abr_Sexo;
    
    
  public boolean isAbr_Sexo_Valida() {
       boolean saida=false;
       if(this.abr_Sexo.length()==3) {
           saida=true;
       }
       return saida;
   }
   
   
   public boolean isNm_Sexo_Valida() {
       boolean saida=false;
       if(this.nm_Sexo.length()<=10) {
           saida=true;
       }
       return saida;
   }

    
}
