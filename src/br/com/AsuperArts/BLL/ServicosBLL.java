
package br.com.AsuperArts.BLL;

import br.com.AsuperArts.DAL.Conexao;
import br.com.AsuperArts.DTO.ServicosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class ServicosBLL {
    String sql;
    Connection con = new Conexao().abrirConexao();
    
    public void cadastrar(ServicosDTO s){
        sql = "INSERT INTO tb_servico(servico,valorH,valorI,metragem)VALUES(?,?,?,?);";
        try {
        PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, s.getServico());
            ps.setDouble(2, s.getValorH());
            ps.setDouble(3, s.getValorI());
            ps.setInt(4, s.getMetro());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<ServicosDTO> lista01(){
        
        ResultSet rs = null;
        sql = "SELECT * FROM tb_servico";
        List<ServicosDTO> clientes =new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ServicosDTO servico = new ServicosDTO();
                
                servico.setId_servico(rs.getInt("id_servico"));
                servico.setServico(rs.getString("servico"));
                servico.setValorH(rs.getDouble("valorH"));
                servico.setValorI(rs.getDouble("valorI"));
                servico.setMetro(rs.getInt("metragem"));
                clientes.add(servico);
            }
            return clientes;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
