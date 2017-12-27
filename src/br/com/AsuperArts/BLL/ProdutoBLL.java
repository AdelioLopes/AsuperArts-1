package br.com.AsuperArts.BLL;

import br.com.AsuperArts.DAL.Conexao;
import br.com.AsuperArts.DTO.ProdutoDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

/**
 * @author Equipe senac 2017
 */
public class ProdutoBLL {
    String sql;
    Connection con = new Conexao().abrirConexao();
    
    public void cadastrarProduto(ProdutoDTO p){
        
        try {
        sql = "INSERT INTO tb_produto(nome_produto,quantidade,valor_unitario,uni_medida)VALUES(?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, p.getNome());
            ps.setInt(2, p.getQuantidade());
            ps.setDouble(3, p.getPreco_compra());
            ps.setInt(4, p.getLargura());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ProdutoDTO listarValorUnitarioProduto(String nome){
         sql = "SELECT * FROM tb_produto WHERE nome_produto='"+nome+"';";
        ProdutoDTO p = new ProdutoDTO();
        try {
            ResultSet rs;
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setId_produto(rs.getInt("id_produto"));
                p.setNome(rs.getString("nome_produto"));
                p.setQuantidade(rs.getInt("quantidade"));
                p.setPreco_compra(rs.getDouble("preco_compra"));
                p.setLargura(rs.getInt("largura"));
            }
            return p;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public List<ProdutoDTO> listaProduto(){
        
        
        sql = "SELECT * FROM tb_produto;";
        List<ProdutoDTO> produtos =new ArrayList<>();
        try {
            ResultSet rs;
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ProdutoDTO produto = new ProdutoDTO();
                
                produto.setId_produto(rs.getInt("id_produto"));
                produto.setNome(rs.getString("nome_produto"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produto.setLargura(rs.getInt("largura"));
                produto.setComprimento(rs.getInt("comprimento"));
                produto.setEspessura(rs.getInt("espessura"));
               produtos.add(produto);
            }
            return produtos;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void ExcluirProduto(ProdutoDTO p){
        sql = "DELETE FROM tb_produto WHERE id_produto=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, p.getId_produto());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public void Alterar(ProdutoDTO p){
        sql = "UPDATE tb_produto SET nome_produto=?, quantidade=?,valor_unitario=?, uni_medida=? WHERE id_produto=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, p.getNome());
            ps.setInt(2, p.getQuantidade());
            ps.setDouble(3, p.getPreco_compra() );
            ps.setInt(4, p.getLargura());     
            ps.setInt(5, p.getId_produto()); 
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDTO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}