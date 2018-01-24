package br.com.AsuperArts.DAL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alunos TCC 2017
 */
public class Conexao {

    private final String DRIVER = ("com.mysql.jdbc.Driver");
    private final String BANCO = ("bd_adelio");
    private final String CONEXAO = ("jdbc:mysql://localhost/"+BANCO);
    private final String USUARIO = ("root");
    private final String SENHA = ("");
    private Connection getConexao(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(CONEXAO, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public Connection abrirConexao(){
        Connection con = getConexao();
        return con;
    }
    
}
