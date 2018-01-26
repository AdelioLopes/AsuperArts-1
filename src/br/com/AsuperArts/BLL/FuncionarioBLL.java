package br.com.AsuperArts.BLL;

import br.com.AsuperArts.DAL.Conexao;
import br.com.AsuperArts.DTO.FuncionarioDTO;
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
public class FuncionarioBLL {
    Connection conexao = new Conexao().abrirConexao();
    String sql;
    public void inserir(FuncionarioDTO func){
        sql = "INSERT INTO tb_funcionario(nome,dt_nascimento,email)VALUES(?,?,?);";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, func.getNome());
            ps.setString(2, func.getDt_nascimento());
            ps.setString(3, func.getEmail());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioBLL.class.getName()).log(Level.SEVERE, null, ex);
        }

   }
    public void alterar(FuncionarioDTO func){
        sql = "UPDATE tb_funcionario SET id_funcionario = ?,nome =?;";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(0, func.getId_funcionario());
            ps.setString(1, func.getNome());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void excluir(FuncionarioDTO func){
        sql = "DELETE FROM tb_funcionario WHERE id_funcionario =?;";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, func.getId_funcionario());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<FuncionarioDTO> listar(){
        ResultSet rs;
        sql = "SELECT * FROM tb_funcionario;";
        List<FuncionarioDTO> funcionarios = new ArrayList<>();
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
               FuncionarioDTO funcionario = new FuncionarioDTO();
               funcionario.setId_funcionario(rs.getInt("id_funcionario"));
               funcionario.setNome(rs.getString("nome"));
               funcionario.setDt_nascimento(rs.getString("dt_nascimento"));
               funcionario.setEmail(rs.getString("email"));
               funcionarios.add(funcionario);
           }
            return funcionarios;
           
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;  
    }
    public void Alterar(FuncionarioDTO f){
        sql = "UPDATE tb_funcionario SET nome=? WHERE id_funcionario=?;";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ps.setString(1, f.getNome());
            ps.setInt(2, f.getId_funcionario());           
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDTO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
