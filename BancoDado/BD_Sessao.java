package BancoDado;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DAO.Conexao;
import Objeto.Objeto_Sessao;


import java.util.ArrayList;

public class BD_Sessao {
  
    private Conexao Con;
    private Objeto_Sessao Registro_Sessao;
    private ArrayList<Objeto_Sessao> Lista;
    
    
    
     public boolean ExcluirSessao (Objeto_Sessao registro)  throws Exception {
        boolean saida=false;
        Con = new Conexao();
        
        String SQL = "DELETE FROM Sessao  WHERE cd_Sessao =  ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        
        ps.setInt(1, registro.getCd_Sessao());
        
        if (ps.executeUpdate()>0) {
            saida=true;
        }
            
        return saida;
    }
     
    
    public boolean InserirSessao (Objeto_Sessao registro)  throws Exception {
        boolean saida=false;
        Con = new Conexao();
        
        String SQL = "INSERT INTO Sessao (dt_sessao, hr_InicioSessao, hr_TerminoSessao, vlr_Sessao, cd_SessaoPsicologo, cd_SessaoPaciente, cd_SessaoPagamento) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setInt(1, registro.getDt_sessao());
        ps.setInt(2, registro.getHr_InicioSessao());
        ps.setInt(3, registro.getHr_TerminoSessao());
        ps.setString(4, registro.getVlr_Sessao());
        ps.setInt(5, registro.getCd_SessaoPsicologo());
        ps.setInt(6, registro.getCd_SessaoPaciente());
        ps.setInt(7, registro.getCd_SessaoPagamento());
        if (ps.executeUpdate()>0) {
            saida=true;
        }
            
        return saida;
    }
    
    
    public  ArrayList<Objeto_Sessao>   CarregarListaSessao () throws Exception {
        Lista = new  ArrayList();
        Con = new Conexao();
        
        String SQL = "SELECT  t1.cd_Sessao, t1.dt_sessao, t1.hr_InicioSessao, t1.hr_TerminoSessao, t1.vlr_Sessao, t1.cd_SessaoPsicologo, t2.nm_Psicologo, t1.cd_SessaoPaciente, t3.nm_paciente, t1.cd_SessaoPagamento, t4.abr_pagamento"
                + "   FROM Sessao AS t1"
                + "   INNER JOIN Psicologo as t2 ON t1.cd_SessaoPsicologo = t2.cd_Psicologo" 
                + "   INNER JOIN Paciente as t3 ON t1.cd_SessaoPaciente = t3.cd_Paciente" 
                + "   INNER JOIN Pagamento as t4 ON t1.cd_SessaoPagamento = t4.cd_Pagamento" ;
        
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Registro_Sessao = new Objeto_Sessao ();
            Registro_Sessao.setCd_Sessao(rs.getInt("cd_Sessao"));
            Registro_Sessao.setDt_sessao(rs.getInt("dt_sessao"));
            Registro_Sessao.setHr_InicioSessao(rs.getInt("hr_InicioSessao"));
            Registro_Sessao.setHr_TerminoSessao(rs.getInt("hr_TerminoSessao"));
            Registro_Sessao.setVlr_Sessao(rs.getString("vlr_Sessao"));
            Registro_Sessao.setCd_SessaoPsicologo(rs.getInt("cd_SessaoPsicologo"));
            Registro_Sessao.setNm_paciente(rs.getString("nm_paciente"));
            Registro_Sessao.setCd_SessaoPaciente(rs.getInt("cd_SessaoPaciente"));
            Registro_Sessao.setNm_Psicologo(rs.getString("nm_Psicologo"));
            Registro_Sessao.setCd_SessaoPagamento(rs.getInt("cd_SessaoPagamento"));
            Registro_Sessao.setAbr_pagamento(rs.getString("abr_pagamento"));
            Lista.add(Registro_Sessao);
        }
        
        return Lista;
    } 
    
     public boolean AlteraSessao (Objeto_Sessao registro) throws Exception {
        boolean saida=false;
        Con = new Conexao();
     
        String SQL = "UPDATE  Sessao SET dt_sessao=?, hr_InicioSessao=?, hr_TerminoSessao=?, vlr_Sessao=?, cd_SessaoPsicologo=?, cd_SessaoPaciente=?, cd_SessaoPagamento=?  WHERE cd_Sessao=?";
        
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        
        
        ps.setInt(1, registro.getDt_sessao());
        ps.setInt(2, registro.getHr_InicioSessao());
        ps.setInt(3, registro.getHr_TerminoSessao());
        ps.setString(4, registro.getVlr_Sessao());
        ps.setInt(5, registro.getCd_SessaoPsicologo());
        ps.setInt(6, registro.getCd_SessaoPaciente());
        ps.setInt(7, registro.getCd_SessaoPagamento());
        ps.setInt(8, registro.getCd_Sessao());// tentativa
        if(ps.executeUpdate() > 0) {
           saida=true; 
        }
        
        return saida;
     }
}
