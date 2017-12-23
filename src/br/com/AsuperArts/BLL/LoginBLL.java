/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.AsuperArts.BLL;

import br.com.AsuperArts.DAL.Conexao;
import br.com.AsuperArts.DTO.LoginDTO;
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
 *
 * @author casa
 */
public class LoginBLL {
    Connection con = new Conexao().abrirConexao();
    String sql;

      public void Inserir(LoginDTO log){
        sql = "INSERT INTO tb_login(usuario,senha,tipo_user)VALUES(?,?,?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, log.getUsuario());
            ps.setString(2, log.getSenha());
            ps.setInt(3, log.getTipoUser());
            ps.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginDTO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public List<LoginDTO> ListarUsuarios(){
          sql = "SELECT * FROM tb_login;";
          ResultSet rs= null;
          List<LoginDTO>usuarios = new ArrayList<>();
          try {
              PreparedStatement ps = con.prepareStatement(sql);
              rs = ps.executeQuery();
              
              while(rs.next()){
                  LoginDTO usuario = new LoginDTO();
                  usuario.setId_login(rs.getInt("id_login"));
                  usuario.setUsuario(rs.getString("usuario"));
                  usuario.setSenha(rs.getString("senha"));
                  usuario.setTipoUser(rs.getInt("tipo_user"));
                  usuarios.add(usuario);
              }
              return usuarios;
          } catch (SQLException e) {
              Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
          }
        return null;
      }
      public void Excluir(LoginDTO log){
        sql="DELETE FROM tb_login WHERE id_login=?";
          try {
              PreparedStatement ps = con.prepareStatement(sql);
              ps.setInt(1, log.getId_login());
              ps.execute();
          } catch (SQLException e) {
              Logger.getLogger(LoginDTO.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error ao excluir dados!"+log.getId_login());
          }
      }
      
        public Integer Validar(String nome, String senha){
            sql= "SELECT tipo_user FROM tb_login WHERE usuario=? AND senha=?;";
            ResultSet rs = null;
            int tipo = 0;
         try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, senha); 
            rs = ps.executeQuery();
            while (rs.next()){
                tipo = rs.getInt("tipo_user");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
         return tipo;
    }
        public void Alterar(LoginDTO l){
        sql = "UPDATE tb_login SET usuario=?, senha=?, tipo_user=? WHERE id_login=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);           
            ps.setString(1, l.getUsuario());
            ps.setString(2, l.getSenha());
            ps.setInt(3, l.getTipoUser());
            ps.setInt(4, l.getId_login());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LoginDTO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
