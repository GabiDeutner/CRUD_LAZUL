package Objeto;


public class Objeto_Paciente {

    public int getCd_paciente() {
        return cd_paciente;
    }

    public int getCd_EstCivilPaciente() {
        return cd_EstCivilPaciente;
    }

    public int getCd_SexoPaciente() {
        return cd_SexoPaciente;
    }

    public String getNm_paciente() {
        return nm_paciente;
    }

    public int getNr_DDDPaciente() {
        return nr_DDDPaciente;
    }

    public int getNr_TelefonePaciente() {
        return nr_TelefonePaciente;
    }

    public String getDt_nascimentoPaciente() {
        return dt_nascimentoPaciente;
    }

    public int getNr_CPFpaciente() {
        return nr_CPFpaciente;
    }

    public int getNr_RGpaciente() {
        return nr_RGpaciente;
    }

    public String getAbr_EstadoCivilPaciente() {
        return abr_EstadoCivilPaciente;
    }

    public String getAbr_Sexo() {
        return abr_Sexo;
    }

    public void setCd_paciente(int cd_paciente) {
        this.cd_paciente = cd_paciente;
    }

    public void setCd_EstCivilPaciente(int cd_EstCivilPaciente) {
        this.cd_EstCivilPaciente = cd_EstCivilPaciente;
    }

    public void setCd_SexoPaciente(int cd_SexoPaciente) {
        this.cd_SexoPaciente = cd_SexoPaciente;
    }

    public void setNm_paciente(String nm_paciente) {
        this.nm_paciente = nm_paciente;
    }

    public void setNr_DDDPaciente(int nr_DDDPaciente) {
        this.nr_DDDPaciente = nr_DDDPaciente;
    }

    public void setNr_TelefonePaciente(int nr_TelefonePaciente) {
        this.nr_TelefonePaciente = nr_TelefonePaciente;
    }

    public void setDt_nascimentoPaciente(String dt_nascimentoPaciente) {
        this.dt_nascimentoPaciente = dt_nascimentoPaciente;
    }

    public void setNr_CPFpaciente(int nr_CPFpaciente) {
        this.nr_CPFpaciente = nr_CPFpaciente;
    }

    public void setNr_RGpaciente(int nr_RGpaciente) {
        this.nr_RGpaciente = nr_RGpaciente;
    }

    public void setAbr_EstadoCivilPaciente(String abr_EstadoCivilPaciente) {
        this.abr_EstadoCivilPaciente = abr_EstadoCivilPaciente;
    }

    public void setAbr_Sexo(String abr_Sexo) {
        this.abr_Sexo = abr_Sexo;
    }
    
    private int cd_paciente;
    private int cd_EstCivilPaciente;
    private int cd_SexoPaciente;
    private String nm_paciente;
    private int nr_DDDPaciente;
    private int nr_TelefonePaciente;
    private String dt_nascimentoPaciente;
    private int nr_CPFpaciente;
    private int nr_RGpaciente;
    
    private String abr_EstadoCivilPaciente;
    private String abr_Sexo;

    
    
    public boolean isNm_Paciente_Valida() {
        boolean saida=false;
        if(this.nm_paciente.length()<=30) {
            saida=true;
        }
        return saida;
    }
    
    public boolean isDt_Paciente_Valida() {
        boolean saida=false;
        if(this.dt_nascimentoPaciente.length()<=10) {
            saida=true;
        }
        return saida;
    }
}
