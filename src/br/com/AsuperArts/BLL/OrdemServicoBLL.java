
package br.com.AsuperArts.BLL;

import br.com.AsuperArts.DAL.Conexao;
import br.com.AsuperArts.DTO.OrdemDeServicoDTO;
import java.sql.Connection;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriel Duarte
 */
public class OrdemServicoBLL {
    Connection con = new Conexao().abrirConexao();
    String sql;
    public void gerarOS(OrdemDeServicoDTO os){
        sql = "INSERT INTO tb_os(cliente,funcionario,servico_solicitado,valor_unitario)VALUES(?,?,?,?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OrdemServicoBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
