
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
    public void abrir(OrdemDeServicoDTO os){
        sql = "INSERT INTO tb_os(data_os,servico,empresa,solicitante,responsavel,valor,descricao)VALUES(?,?,?,?,?,?,?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, os.getData_os());
            ps.setString(2, os.getServico());
            ps.setString(3, os.getEmpresa());
            ps.setString(4, os.getSolicitante());
            ps.setString(5, os.getResponsavel());
            ps.setDouble(6, os.getValor());
            ps.setString(7, os.getDescricao());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OrdemServicoBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
