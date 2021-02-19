package BancoDado;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DAO.Conexao;
import Objeto.Objeto_Psicologo;
import Objeto.Objeto_Sexo;
import java.util.ArrayList;

public class BD_Psicologo {
    
    private Conexao Con;
    private Objeto_Psicologo Registro_Psicologo;
    private ArrayList<Objeto_Psicologo> Lista;

    
     public boolean ExcluirPsicologo (Objeto_Psicologo registro)  throws Exception {
        boolean saida=false;
        Con = new Conexao();
        
        String SQL = "DELETE FROM Psicologo  WHERE cd_Psicologo =  ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        
        ps.setInt(1, registro.getCd_Psicologo());
        
        if (ps.executeUpdate()>0) {
            saida=true;
        }
            
        return saida;
    }
    
    
     public boolean InserirPsicologo (Objeto_Psicologo registro)  throws Exception {
        boolean saida=false;
        Con = new Conexao();
        
        String SQL = "INSERT INTO Psicologo (nm_Psicologo, nr_CRPpsicologo, nr_DDDpsicologo, nr_Telefonepsicologo, ds_emailPsicologo, nm_FaculdadePsicologo, dt_DataNascimentoPsi, nr_CPFpsicologo, nr_RGpsicologo, cd_SexoPsicologo) VALUES (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, registro.getNm_Psicologo());
        ps.setInt(2, registro.getNr_CRPpsicologo());
        ps.setInt(3, registro.getNr_DDDpsicologo());
        ps.setInt(4, registro.getNr_Telefonepsicologo());
        ps.setString(5, registro.getDs_emailPsicologo());
        ps.setString(6, registro.getNm_FaculdadePsicologo());
        ps.setInt(7, registro.getDt_DataNascimentoPsi());
        ps.setInt(8, registro.getNr_CPFpsicologo());
        ps.setInt(9, registro.getNr_RGpsicologo());
        ps.setInt(10, registro.getCd_SexoPsicologo());
        
        if (ps.executeUpdate()>0) {
            saida=true;
        }
            
        return saida;
    }
     
    public boolean AlteraPsicologo (Objeto_Psicologo registro) throws Exception {
        boolean saida=false;
        Con = new Conexao();
     
        String SQL = "UPDATE  Psicologo SET nm_Psicologo=?, nr_CRPpsicologo=?, nr_DDDpsicologo=?, nr_Telefonepsicologo=?, ds_emailPsicologo=?, nm_FaculdadePsicologo=?, dt_DataNascimentoPsi=?, nr_CPFpsicologo=?, nr_RGpsicologo=?, cd_SexoPsicologo=?  WHERE cd_Psicologo =  ?";
        
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        
        
        ps.setString(1, registro.getNm_Psicologo());
        ps.setInt(2, registro.getNr_CRPpsicologo());
        ps.setInt(3, registro.getNr_DDDpsicologo());
        ps.setInt(4, registro.getNr_Telefonepsicologo());
        ps.setString(5, registro.getDs_emailPsicologo());
        ps.setString(6, registro.getNm_FaculdadePsicologo());
        ps.setInt(7, registro.getDt_DataNascimentoPsi());
        ps.setInt(8, registro.getNr_CPFpsicologo());
        ps.setInt(9, registro.getNr_RGpsicologo());
        ps.setInt(10, registro.getCd_SexoPsicologo());
        ps.setInt(11, registro.getCd_Psicologo()); // tentativa
        if(ps.executeUpdate() > 0) {
           saida=true; 
        }
        
        return saida;
     }
     
    
    public  ArrayList<Objeto_Psicologo>   CarregarListaPsicologo () throws Exception {
        Lista = new  ArrayList();
        Con = new Conexao();
        
        String SQL = "SELECT  t1.cd_Psicologo, t1.nm_Psicologo, t1.nr_CRPpsicologo, t1.nr_DDDpsicologo, t1.nr_Telefonepsicologo, t1.ds_emailPsicologo, t1.nm_FaculdadePsicologo, t1.dt_DataNascimentoPsi, t1.nr_CPFpsicologo, t1.nr_RGpsicologo, t1.cd_SexoPsicologo, t2.abr_Sexo"
                + "   FROM Psicologo AS t1"
                + "   INNER JOIN Sexo as t2 ON t2.cd_Sexo = t1.cd_SexoPsicologo"; 
        
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Registro_Psicologo = new Objeto_Psicologo ();
            Registro_Psicologo.setCd_Psicologo(rs.getInt("cd_Psicologo"));
            Registro_Psicologo.setNm_Psicologo(rs.getString("nm_Psicologo"));
            Registro_Psicologo.setNr_CRPpsicologo(rs.getInt("nr_CRPpsicologo"));
            Registro_Psicologo.setNr_DDDpsicologo(rs.getInt("nr_DDDpsicologo"));
            Registro_Psicologo.setNr_Telefonepsicologo(rs.getInt("nr_Telefonepsicologo"));
            Registro_Psicologo.setDs_emailPsicologo(rs.getString("ds_emailPsicologo"));
            Registro_Psicologo.setNm_FaculdadePsicologo(rs.getString("nm_FaculdadePsicologo"));
            Registro_Psicologo.setDt_DataNascimentoPsi(rs.getInt("dt_DataNascimentoPsi"));
            Registro_Psicologo.setNr_CPFpsicologo(rs.getInt("nr_CPFpsicologo"));
            Registro_Psicologo.setNr_RGpsicologo(rs.getInt("nr_RGpsicologo"));
            Registro_Psicologo.setCd_SexoPsicologo(rs.getInt("cd_SexoPsicologo")); 
            Registro_Psicologo.setAbr_Sexo(rs.getString("abr_Sexo"));
            Lista.add(Registro_Psicologo);
        }
        
        return Lista;
    }
    
    public int busca_nm_Psicologo (String nm) throws Exception {
        int saida=0;
        Con = new Conexao();
        
        String SQL = "SELECT cd_Psicologo FROM Psicologo WHERE nm_Psicologo = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, nm);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            saida=rs.getInt("cd_Psicologo");
        }
        return saida;
    }
    
}
