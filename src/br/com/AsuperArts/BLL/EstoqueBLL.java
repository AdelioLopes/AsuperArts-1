
package br.com.AsuperArts.BLL;

import br.com.AsuperArts.DAL.Conexao;
import br.com.AsuperArts.DTO.EstoqueDTO;
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
 * @author Equipe Senac 2017
 */
public class EstoqueBLL {
     String sql;
    Connection con = new Conexao().abrirConexao();
    
    public void cadastrar(EstoqueDTO e){
     sql = "INSERT INTO tb_estoque(nome,cor,espessura,comprimento,largura,valorCompra,valorCm)VALUES(?,?,?,?,?,?,?);";
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setString(1, e.getNome());
             ps.setString(2, e.getCor());
             ps.setInt(3, e.getEspessura());
             ps.setInt(4, e.getComprimento());
             ps.setInt(5, e.getLargura());
             ps.setInt(6, e.getValorCompra());
             ps.setInt(7, e.getValorCm());
             ps.execute();
         } catch (SQLException ex) {
             Logger.getLogger(EstoqueBLL.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    public List<EstoqueDTO> ListaEstoque(){
         try {
             ResultSet rs = null;
             sql = "SELECT * FROM tb_estoque;";
             List<EstoqueDTO> produtos =new ArrayList<>();
             PreparedStatement ps = con.prepareStatement(sql);
             rs = ps.executeQuery();
              while (rs.next()) {
                  EstoqueDTO estoque = new EstoqueDTO();
                  
                  estoque.setIdEstoque(rs.getInt("id_estoque"));
                  estoque.setNome(rs.getString("nome"));
                  estoque.setCor(rs.getString("cor"));
                  estoque.setEspessura(rs.getInt("espessura"));
                  estoque.setComprimento(rs.getInt("comprimento"));
                  estoque.setLargura(rs.getInt("largura"));
                  estoque.setValorCompra(rs.getInt("valorCompra"));
                  estoque.setValorCm(rs.getInt("valorCm"));
                  produtos.add(estoque);
              }
              return produtos;
         } catch (SQLException ex) {
             Logger.getLogger(EstoqueBLL.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }
        public EstoqueDTO listaEstoqueNome(String nome){
    
        ResultSet rs = null;
        sql = "SELECT * FROM tb_estoque WHERE nome='" + nome + "';";
        EstoqueDTO estoque = new EstoqueDTO();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                estoque.setIdEstoque(rs.getInt("id_estoque"));
                  estoque.setNome(rs.getString("nome"));
                  estoque.setCor(rs.getString("cor"));
                  estoque.setEspessura(rs.getInt("espessura"));
                  estoque.setComprimento(rs.getInt("comprimento"));
                  estoque.setLargura(rs.getInt("largura"));
                  estoque.setValorCompra(rs.getInt("valorCompra"));
                  estoque.setValorCm(rs.getInt("valorCm"));
                  
            }
            return estoque;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void alterar(EstoqueDTO e){
        sql = "UPDATE tb_estoque SET nome=?,cor=?,espessura=?,comprimento=?,largura=?,valorCompra=?,valorCm=? WHERE id_estoque=?;";
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setString(1, e.getNome());
             ps.setString(2, e.getCor());
             ps.setDouble(3, e.getEspessura());
             ps.setDouble(4, e.getComprimento());
             ps.setDouble(5, e.getLargura());
             ps.setDouble(6, e.getValorCompra());
             ps.setDouble(7, e.getValorCm());
             ps.setDouble(8, e.getIdEstoque());
             ps.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(EstoqueBLL.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    public void excluir(EstoqueDTO e){
    sql = "DELETE FROM tb_estoque WHERE id_estoque=?;";
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, e.getIdEstoque());
             ps.execute();
         } catch (SQLException ex) {
             Logger.getLogger(EstoqueBLL.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
}
