package BancoDado;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DAO.Conexao;
import Objeto.Objeto_EstadoCivil;

import java.util.ArrayList;

public class BD_EstadoCivil {
    
    Conexao Con;
    
    private Objeto_EstadoCivil Registro_EstadoCivil;
    private ArrayList<Objeto_EstadoCivil> Lista;
    
    public  ArrayList<Objeto_EstadoCivil>   CarregarListaEstadoCivil () throws Exception {
        Lista = new  ArrayList();
        Con = new Conexao();
        
        String SQL = "SELECT  cd_EstadoCivilPaciente , nm_EstadoCivilPaciente, abr_EstadoCivilPaciente FROM EstadoCivilPaciente";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Registro_EstadoCivil = new Objeto_EstadoCivil ();
            Registro_EstadoCivil.setCd_EstadoCivilPaciente(rs.getInt("cd_EstadoCivilPaciente"));
            Registro_EstadoCivil.setNm_EstadoCivilPaciente(rs.getString("nm_EstadoCivilPaciente"));
            Registro_EstadoCivil.setAbr_EstadoCivilPaciente(rs.getString("abr_EstadoCivilPaciente"));
            Lista.add(Registro_EstadoCivil);
        }
        
        return Lista;
    } 
    
    
    
        public boolean ExcluiEstadoCivil (int cd_estado) throws Exception {
        boolean saida=false;
        Con = new Conexao();
     
        String SQL = "DELETE FROM EstadoCivilPaciente  WHERE cd_EstadoCivilPaciente =  ?";
        
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        
        ps.setInt(1, cd_estado);
        
        if(ps.executeUpdate() > 0) {
           saida=true; 
        }
        
        return saida;
     }
     

        
        
    public boolean InserirEstadoCivil (Objeto_EstadoCivil registro)  throws Exception {
        boolean saida=false;
        Con = new Conexao();
        
        String SQL = "INSERT INTO EstadoCivilPaciente (nm_EstadoCivilPaciente, abr_EstadoCivilPaciente) VALUES (?,?)";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, registro.getNm_EstadoCivilPaciente());
        ps.setString(2, registro.getAbr_EstadoCivilPaciente());
        
        if (ps.executeUpdate()>0) {
            saida=true;
        }
            
        return saida; 
    }
    
    
        public boolean busca_abr_EstadoCivil_altera (Objeto_EstadoCivil registro) throws Exception {
    
        boolean saida=true;
        Con = new Conexao();
        
        String SQL = "SELECT TOP 1 cd_EstadoCivilPaciente FROM EstadoCivilPaciente WHERE abr_EstadoCivilPaciente = ? AND cd_EstadoCivilPaciente <> ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, registro.getAbr_EstadoCivilPaciente());
        ps.setInt(2, registro.getCd_EstadoCivilPaciente());
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            saida=false;
        }
        return saida;
    }
    
    
            public boolean AlterarEstadoCivil (Objeto_EstadoCivil registro)  throws Exception {
        boolean saida=false;
        Con = new Conexao();
        
        String SQL = "UPDATE EstadoCivilPaciente SET nm_EstadoCivilPaciente=?, abr_EstadoCivilPaciente=? WHERE cd_EstadoCivilPaciente=?";
        
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, registro.getNm_EstadoCivilPaciente());
        ps.setString(2, registro.getAbr_EstadoCivilPaciente());
        ps.setInt(3, registro.getCd_EstadoCivilPaciente());
        
        if (ps.executeUpdate()>0) {
            saida=true;
        }
            
        return saida;
    }
        
        
    
        public int busca_abr_EstadoCivil (String abr) throws Exception {
        int saida=0;
        Con = new Conexao();
        
        String SQL = "SELECT cd_EstadoCivilPaciente FROM EstadoCivilPaciente WHERE abr_EstadoCivilPaciente = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, abr);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            saida=rs.getInt("cd_EstadoCivilPaciente");
        }
        return saida;
    }
    
}
