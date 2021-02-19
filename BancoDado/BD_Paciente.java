package BancoDado;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DAO.Conexao;
import Objeto.Objeto_Paciente;
import Objeto.Objeto_Sexo;
import Objeto.Objeto_EstadoCivil;
import java.util.ArrayList;

public class BD_Paciente {
    
    private Conexao Con;
    private Objeto_Paciente Registro_Paciente;
    private ArrayList<Objeto_Paciente> Lista;

    
     public boolean ExcluirPaciente (Objeto_Paciente registro)  throws Exception {
        boolean saida=false;
        Con = new Conexao();
        
        String SQL = "DELETE FROM Paciente  WHERE cd_paciente =  ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        
        ps.setInt(1, registro.getCd_paciente());
        
        if (ps.executeUpdate()>0) {
            saida=true;
        }
            
        return saida;
    }
    
    
     public boolean InserirPaciente (Objeto_Paciente registro)  throws Exception {
        boolean saida=false;
        Con = new Conexao();
        
        String SQL = "INSERT INTO Paciente (nm_paciente, nr_DDDPaciente, nr_TelefonePaciente, dt_nascimentoPaciente, nr_CPFpaciente, nr_RGpaciente, cd_SexoPaciente, cd_EstCivilPaciente) VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, registro.getNm_paciente());
        ps.setInt(2, registro.getNr_DDDPaciente());
        ps.setInt(3, registro.getNr_TelefonePaciente());
        ps.setString(4, registro.getDt_nascimentoPaciente());
        ps.setInt(5, registro.getNr_CPFpaciente());
        ps.setInt(6, registro.getNr_RGpaciente());
        ps.setInt(7, registro.getCd_SexoPaciente());
        ps.setInt(8, registro.getCd_EstCivilPaciente());
        
        if (ps.executeUpdate()>0) {
            saida=true;
        }
            
        return saida;
    }
     
     
     public boolean AlteraPaciente (Objeto_Paciente registro) throws Exception {
        boolean saida=false;
        Con = new Conexao();
     
        String SQL = "UPDATE  Paciente SET nm_paciente=?, nr_DDDPaciente=?, nr_TelefonePaciente=?, dt_nascimentoPaciente=?, nr_CPFpaciente=?, nr_RGpaciente=?, cd_SexoPaciente=?, cd_EstCivilPaciente=?  WHERE cd_Paciente=?";
        
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        
        
        ps.setString(1, registro.getNm_paciente());
        ps.setInt(2, registro.getNr_DDDPaciente());
        ps.setInt(3, registro.getNr_TelefonePaciente());
        ps.setString(4, registro.getDt_nascimentoPaciente());
        ps.setInt(5, registro.getNr_CPFpaciente());
        ps.setInt(6, registro.getNr_RGpaciente());
        ps.setInt(7, registro.getCd_SexoPaciente());
        ps.setInt(8, registro.getCd_EstCivilPaciente());
        ps.setInt(9, registro.getCd_paciente());
        if(ps.executeUpdate() > 0) {
           saida=true; 
        }
        
        return saida;
     }
     
    
    public  ArrayList<Objeto_Paciente>   CarregarListaPaciente () throws Exception {
        Lista = new  ArrayList();
        Con = new Conexao();
        
        String SQL = "SELECT  t1.cd_paciente, t1.nm_paciente, t1.nr_DDDPaciente, t1.nr_TelefonePaciente, t1.dt_nascimentoPaciente, t1.nr_CPFpaciente, t1.nr_RGpaciente, t1.nr_CPFpaciente, t1.cd_SexoPaciente, t2.abr_Sexo, t1.cd_EstCivilPaciente, t3.abr_EstadoCivilPaciente "
                + "   FROM Paciente AS t1"
                + "   INNER JOIN Sexo as t2 ON t2.cd_Sexo = t1.cd_SexoPaciente" 
                + "   INNER JOIN EstadoCivilPaciente as t3 ON t3.cd_EstadoCivilPaciente = t1.cd_EstCivilPaciente" ;
        
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Registro_Paciente = new Objeto_Paciente ();
            Registro_Paciente.setCd_paciente(rs.getInt("cd_paciente"));
            Registro_Paciente.setNm_paciente(rs.getString("nm_paciente"));
            Registro_Paciente.setNr_DDDPaciente(rs.getInt("nr_DDDPaciente"));
            Registro_Paciente.setNr_TelefonePaciente(rs.getInt("nr_TelefonePaciente"));
            Registro_Paciente.setDt_nascimentoPaciente(rs.getString("dt_nascimentoPaciente"));
            Registro_Paciente.setNr_CPFpaciente(rs.getInt("nr_CPFpaciente"));
            Registro_Paciente.setNr_RGpaciente(rs.getInt("nr_RGpaciente"));
            Registro_Paciente.setCd_SexoPaciente(rs.getInt("cd_SexoPaciente"));
            Registro_Paciente.setAbr_Sexo(rs.getString("abr_Sexo"));
            Registro_Paciente.setCd_EstCivilPaciente(rs.getInt("cd_EstCivilPaciente"));
            Registro_Paciente.setAbr_EstadoCivilPaciente(rs.getString("abr_EstadoCivilPaciente"));
            Lista.add(Registro_Paciente);
        }
        
        return Lista;
    }

    public int busca_nm_paciente(String nm_paciente) throws Exception {
        int saida=0;
        Con = new Conexao();
        
        String SQL = "SELECT cd_paciente FROM Paciente WHERE nm_paciente = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, nm_paciente);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            saida=rs.getInt("cd_paciente");
        }
        return saida;
    }
        
        
    }
    
