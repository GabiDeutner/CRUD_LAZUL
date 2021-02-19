
package Objeto;

public class Objeto_EstadoCivil {
    
    private int cd_EstadoCivilPaciente;
    private String nm_EstadoCivilPaciente;

    public void setCd_EstadoCivilPaciente(int cd_EstadoCivilPaciente) {
        this.cd_EstadoCivilPaciente = cd_EstadoCivilPaciente;
    }

    public void setNm_EstadoCivilPaciente(String nm_EstadoCivilPaciente) {
        this.nm_EstadoCivilPaciente = nm_EstadoCivilPaciente;
    }

    public void setAbr_EstadoCivilPaciente(String abr_EstadoCivilPaciente) {
        this.abr_EstadoCivilPaciente = abr_EstadoCivilPaciente;
    }

    public int getCd_EstadoCivilPaciente() {
        return cd_EstadoCivilPaciente;
    }

    public String getNm_EstadoCivilPaciente() {
        return nm_EstadoCivilPaciente;
    }

    public String getAbr_EstadoCivilPaciente() {
        return abr_EstadoCivilPaciente;
    }
    private String abr_EstadoCivilPaciente;
 
    
    

    
    public boolean isAbr_EstadoCivil_Valida() {
        boolean saida=false;
        if(this.abr_EstadoCivilPaciente.length()==3) {
            saida=true;
        }
        return saida;
    }
   
   
    public boolean isNm_EstadoCivil_Valida() {
        boolean saida=false;
        if(this.nm_EstadoCivilPaciente.length()<=10) {
            saida=true;
        }
        return saida;
    }
    
}
