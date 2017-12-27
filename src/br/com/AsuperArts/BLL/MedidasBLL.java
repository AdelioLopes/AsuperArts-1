
package br.com.AsuperArts.BLL;

import br.com.AsuperArts.DAL.Conexao;
import br.com.AsuperArts.DTO.MedidasDTO;
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
public class MedidasBLL {
    Connection con = new Conexao().abrirConexao();
    String sql;
    
    public void inserir(MedidasDTO m){
    sql = "INSERT INTO tb_medidas (largura,comprimento,hora,tamanho,peso)VALUES(?,?,?,?,?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, m.getLargura());
            ps.setInt(2, m.getComprimento());
            ps.setInt(3, m.getHora());
            ps.setInt(4, m.getTamanho());
            ps.setInt(5, m.getPeso());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MedidasBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<MedidasDTO> largura(){
        sql = "SELECT largura FROM tb_medidas;";
        List<MedidasDTO> medidas =new ArrayList<>();
        ResultSet rs;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                MedidasDTO medida = new MedidasDTO();
                medida.setLargura(rs.getInt("largura"));
                medidas.add(medida);
            }
            return medidas;
        } catch (SQLException ex) {
            Logger.getLogger(MedidasBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    return null;
    }
    public List<MedidasDTO> comprimento(){
        sql = "SELECT comprimento FROM tb_medidas;";
        List<MedidasDTO> medidas =new ArrayList<>();
        ResultSet rs;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                MedidasDTO medida = new MedidasDTO();
                medida.setComprimento(rs.getInt("comprimento"));
                medidas.add(medida);
            }
            return medidas;
        } catch (SQLException ex) {
            Logger.getLogger(MedidasBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    return null;
    }
    
    public List<MedidasDTO> listaMedidas(){
        sql = "SELECT * FROM tb_medidas;";
        List<MedidasDTO> medidas =new ArrayList<>();
        ResultSet rs;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                MedidasDTO medida = new MedidasDTO();
                medida.setId_medidas(rs.getInt("id_medida"));
                medida.setLargura(rs.getInt("largura"));
                medida.setComprimento(rs.getInt("comprimento"));
                medida.setHora(rs.getInt("hora"));
                medida.setTamanho(rs.getInt("tamanho"));
                medida.setPeso(rs.getInt("peso"));
                medidas.add(medida);
                
            }
            return medidas;
        } catch (SQLException ex) {
            Logger.getLogger(MedidasBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return null;
    }
}
