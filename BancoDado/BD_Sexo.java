package BancoDado;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DAO.Conexao;
import Objeto.Objeto_Sexo;

import java.util.ArrayList;

public class BD_Sexo {

    
    Conexao Con;
    
    private Objeto_Sexo Registro_Sexo;
    private ArrayList<Objeto_Sexo> Lista;
    
    public boolean ExcluirSexo (Objeto_Sexo registro)  throws Exception {
        boolean saida=false;
        Con = new Conexao();
        
        String SQL = "DELETE FROM Sexo  WHERE cd_Sexo =  ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        
        ps.setInt(1, registro.getCd_Sexo());
        
        if (ps.executeUpdate()>0) {
            saida=true;
        }
            
        return saida;
    }
    
    
    
        public int busca_abr_Sexo (String abr) throws Exception {
        int saida=0;
        Con = new Conexao();
        
        String SQL = "SELECT cd_Sexo FROM Sexo WHERE abr_Sexo = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, abr);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            saida=rs.getInt("cd_Sexo");
        }
        return saida;
    }
        
    public boolean busca_abr_Sexo_altera (Objeto_Sexo registro) throws Exception {
    
        boolean saida=true;
        Con = new Conexao();
        
        String SQL = "SELECT TOP 1 cd_Sexo FROM Sexo WHERE abr_Sexo = ? AND cd_Sexo <> ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, registro.getAbr_Sexo());
        ps.setInt(2, registro.getCd_Sexo());
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            saida=false;
        }
        return saida;
    }
    
    
    public boolean InserirSexo (Objeto_Sexo registro)  throws Exception {
        boolean saida=false;
        Con = new Conexao();
        
        String SQL = "INSERT INTO Sexo (nm_Sexo, abr_Sexo) VALUES (?,?)";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, registro.getNm_Sexo());
        ps.setString(2, registro.getAbr_Sexo());
        
        if (ps.executeUpdate()>0) {
            saida=true;
        }
            
        return saida;
    }
    
        public boolean AlterarSexo (Objeto_Sexo registro)  throws Exception {
        boolean saida=false;
        Con = new Conexao();
        
        String SQL = "UPDATE Sexo SET nm_Sexo=?, abr_Sexo=? WHERE cd_Sexo=?";
        
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, registro.getNm_Sexo());
        ps.setString(2, registro.getAbr_Sexo());
        ps.setInt(3, registro.getCd_Sexo());
        
        if (ps.executeUpdate()>0) {
            saida=true;
        }
            
        return saida;
    }
    
    
    public  ArrayList<Objeto_Sexo>   CarregarListaSexo () throws Exception {
        Lista = new  ArrayList();
        Con = new Conexao();
        
        String SQL = "SELECT  cd_Sexo, nm_Sexo, abr_Sexo FROM Sexo";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Registro_Sexo = new Objeto_Sexo ();
            Registro_Sexo.setCd_Sexo(rs.getInt("cd_Sexo"));
            Registro_Sexo.setNm_Sexo(rs.getString("nm_Sexo"));
            Registro_Sexo.setAbr_Sexo(rs.getString("abr_Sexo"));
            Lista.add(Registro_Sexo);
        }
        
        return Lista;
    } 
    


    
}