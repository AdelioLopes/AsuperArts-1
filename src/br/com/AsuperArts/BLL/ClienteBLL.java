package br.com.AsuperArts.BLL;
import br.com.AsuperArts.DAL.Conexao;
import br.com.AsuperArts.DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Equipe senac 2017
 */
public class ClienteBLL {
    String sql;
    Connection con = new Conexao().abrirConexao();
        
    public void cadastrarCliente(ClienteDTO c){
        sql = "INSERT INTO tb_cliente(nome,contato,ddd,telefone,email)VALUES(?,?,?,?,?);";
        try {
        PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(0, c.getNome());
            ps.setString(1, c.getContato());
            ps.setInt(2, c.getDdd());
            ps.setInt(3, c.getTelefone());
            ps.setString(4, c.getEmail());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public List<ClienteDTO> listaCliente(){
        
        ResultSet rs = null;
        sql = "SELECT * FROM tb_cliente;";
        List<ClienteDTO> clientes =new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ClienteDTO cliente = new ClienteDTO();
                
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setContato(rs.getString("contato"));
                cliente.setDdd(rs.getInt("ddd"));
                cliente.setTelefone(rs.getInt("telefone"));
                cliente.setEmail(rs.getString("email"));
                clientes.add(cliente);
            }
            return clientes;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ClienteDTO listaClienteNome(String nome){
    
        ResultSet rs = null;
        sql = "SELECT * FROM tb_cliente WHERE nome='" + nome + "';";
        ClienteDTO c = new ClienteDTO();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                c.setId_cliente(rs.getInt("id_cliente"));
                c.setNome(rs.getString("nome"));
                c.setContato(rs.getString("contato"));
                c.setDdd(rs.getInt("ddd"));
                c.setTelefone(rs.getInt("telefone"));
                c.setEmail(rs.getString("email"));
            }
            return c;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void alterar(ClienteDTO c){
        sql = "UPDATE tb_cliente SET nome=?,contato=?,ddd=?,telefone=?, email=? WHERE id_cliente=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, c.getNome());
            ps.setString(2, c.getContato());
            ps.setInt(3, c.getDdd());
            ps.setInt(4, c.getTelefone());
            ps.setString(5, c.getEmail());
            ps.setInt(6, c.getId_cliente());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ExcluirCliente(ClienteDTO c){
        sql = "DELETE FROM tb_cliente WHERE id_cliente=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c.getId_cliente());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
