
package BancoDado;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DAO.Conexao;
import Objeto.Objeto_Pagamento;


import java.util.ArrayList;



public class BD_Pagamento {
    

    private Conexao Con;
    private Objeto_Pagamento Registro_Pagamento;
    private ArrayList<Objeto_Pagamento> Lista;
    
    
    
    public int busca_abr_pagamento (String abr) throws Exception {
        int saida=0;
        Con = new Conexao();
        
        String SQL = "SELECT cd_Pagamento FROM Pagamento WHERE abr_pagamento = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, abr);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            saida=rs.getInt("cd_pagamento");
        }
        return saida;
    }
    
    
    public boolean busca_abr_Pagamento_altera (Objeto_Pagamento registro) throws Exception {
    
        boolean saida=true;
        Con = new Conexao();
        
        String SQL = "SELECT TOP 1 cd_Pagamento FROM Pagamento WHERE abr_pagamento = ? AND cd_Pagamento <> ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, registro.getAbr_pagamento());
        ps.setInt(2, registro.getCd_Pagamento());
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            saida=false;
        }
        return saida;
    }
    
    
    public boolean AlterarPagamento (Objeto_Pagamento registro)  throws Exception {
        boolean saida=false;
        Con = new Conexao();
        
        String SQL = "UPDATE Pagamento SET tp_pagamento=?, abr_pagamento=? WHERE cd_Pagamento=?";
        
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, registro.getTp_pagamento());
        ps.setString(2, registro.getAbr_pagamento());
        ps.setInt(3, registro.getCd_Pagamento());
        
        if (ps.executeUpdate()>0) {
            saida=true;
        }
            
        return saida;
    }
     
     
     public boolean ExcluiPagamento (int cd_pagamento) throws Exception {
        boolean saida=false;
        Con = new Conexao();
     
        String SQL = "DELETE FROM Pagamento  WHERE cd_Pagamento =  ?";
        
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        
        ps.setInt(1, cd_pagamento);
        
        if(ps.executeUpdate() > 0) {
           saida=true; 
        }
        
        return saida;
     }
     
    
    public boolean InserirPagamento (Objeto_Pagamento registro)  throws Exception {
        boolean saida=false;
        Con = new Conexao();
        
        String SQL = "INSERT INTO Pagamento (abr_pagamento, tp_pagamento) VALUES (?,?)";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, registro.getAbr_pagamento());
        ps.setString(2, registro.getTp_pagamento());

        
        if (ps.executeUpdate()>0) {
            saida=true;
        }
            
        return saida;
    }
    
    
    public  ArrayList<Objeto_Pagamento>   CarregarListaPagamento () throws Exception {
        Lista = new  ArrayList();
        Con = new Conexao();
        
        String SQL = "SELECT  cd_Pagamento, tp_pagamento, abr_pagamento FROM Pagamento";

        
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Registro_Pagamento = new Objeto_Pagamento ();
            Registro_Pagamento.setCd_Pagamento(rs.getInt("cd_Pagamento"));
            Registro_Pagamento.setAbr_pagamento(rs.getString("abr_pagamento"));
            Registro_Pagamento.setTp_pagamento(rs.getString("tp_pagamento"));
            Lista.add(Registro_Pagamento);
        }
        
        return Lista;
    } 
    

}
