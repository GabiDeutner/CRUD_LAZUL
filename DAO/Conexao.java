package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
	private Connection conexao;
        
	public Conexao() throws Exception{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=LAZUL";
            conexao = DriverManager.getConnection(url,"usuario","1234");
        
        }
        
	public Connection getConexao(){
		return conexao;
        }
}