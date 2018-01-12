
package br.com.AsuperArts.BLL;

import br.com.AsuperArts.DAL.Conexao;
import br.com.AsuperArts.DTO.ProdutosDTO;
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
 * @author Equipe senac 2017
 */
public class ProdutosBLL {
    String sql;
    Connection con = new Conexao().abrirConexao();
    public void inserir(ProdutosDTO p){
    sql = "INSERT INTO tb_produtos(nome)VALUES(?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, p.getNome());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void excluir(){
    
    
    }
    
    public List<ProdutosDTO> listaProduto(){
        
        
        sql = "SELECT * FROM tb_produtos;";
        List<ProdutosDTO> produtos =new ArrayList<>();
        try {
            ResultSet rs;
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ProdutosDTO produto = new ProdutosDTO();
                
                produto.setId_produtos(rs.getInt("id_produtos"));
                produto.setNome(rs.getString("nome"));
                
               produtos.add(produto);
            }
            return produtos;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
