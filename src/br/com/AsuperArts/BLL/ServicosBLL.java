
package br.com.AsuperArts.BLL;

import br.com.AsuperArts.DAL.Conexao;
import br.com.AsuperArts.DTO.ServicosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class ServicosBLL {
    String sql;
    Connection con = new Conexao().abrirConexao();
    
    public void cadastrarCliente(ServicosDTO s){
        sql = "INSERT INTO tb_servico(servico,valorH,valorI,valorP)VALUES(?,?,?,?);";
        try {
        PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, s.getServico());
            ps.setDouble(2, s.getValorH());
            ps.setDouble(3, s.getValorI());
            ps.setDouble(4, s.getValorP());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
