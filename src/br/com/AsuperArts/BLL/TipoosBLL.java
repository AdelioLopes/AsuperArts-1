package br.com.AsuperArts.BLL;

import br.com.AsuperArts.DAL.Conexao;
import br.com.AsuperArts.DTO.TipoosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Aluno
 */
public class TipoosBLL {
    String sql;
    Connection con = new Conexao().abrirConexao();
    
    public void Inserir(TipoosDTO t){     
        try {
        sql = "INSERT INTO tb_tipoOs(nome)VALUES(?);";
        PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getNome());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TipoosBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Excluir(TipoosDTO t){
        sql = "DELETE FROM tb_tipoOs WHERE id_tipoOs=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, t.getId_tipoOs());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TipoosBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public List<TipoosDTO> listaTipoOs(){
        
        
        sql = "SELECT * FROM tb_tipoOs;";
        List<TipoosDTO> tipos =new ArrayList<>();
        try {
            ResultSet rs;
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                TipoosDTO tipo = new TipoosDTO();
                
                tipo.setId_tipoOs(rs.getInt("id_tipoOs"));
                tipo.setNome(rs.getString("nome"));
                tipos.add(tipo);
            }
            return tipos;
        } catch (SQLException ex) {
            Logger.getLogger(TipoosBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void Alterar(TipoosDTO t){
        sql = "UPDATE tb_tipoos SET nome=? WHERE id_tipoOs=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, t.getNome());
            ps.setInt(2, t.getId_tipoOs());           
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TipoosDTO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
