
package br.com.AsuperArts.BLL;

import br.com.AsuperArts.DAL.Conexao;
import br.com.AsuperArts.DTO.OrdemDeServicoDTO;
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
 * @author Gabriel Duarte
 */
public class OrdemServicoBLL {
    Connection con = new Conexao().abrirConexao();
    String sql;
    public void abrir(OrdemDeServicoDTO os){
        sql = "INSERT INTO tb_os(data_os,servico,empresa,solicitante,responsavel,valor,descricao,estado,data_fechada)VALUES(?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, os.getData_os());
            ps.setString(2, os.getServico());
            ps.setString(3, os.getEmpresa());
            ps.setString(4, os.getSolicitante());
            ps.setString(5, os.getResponsavel());
            ps.setDouble(6, os.getValor());
            ps.setString(7, os.getDescricao());
            ps.setString(8, os.getEstado());
            ps.setString(9, os.getDataFechada());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OrdemServicoBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
     public List<OrdemDeServicoDTO> lista(){
        try {
            sql = "SELECT * FROM tb_os WHERE estado='Aberta';";
            List<OrdemDeServicoDTO> servicos =new ArrayList<>();
            ResultSet rs = null;
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
            OrdemDeServicoDTO servico = new OrdemDeServicoDTO();
            servico.setId_os(rs.getInt("id_os"));
            servico.setData_os(rs.getString("data_os"));
            servico.setServico(rs.getString("servico"));
            servico.setEmpresa(rs.getString("empresa"));
            servico.setSolicitante(rs.getString("solicitante"));
            servico.setResponsavel(rs.getString("responsavel"));
            servico.setValor(rs.getDouble("valor"));
            servico.setDescricao(rs.getString("descricao"));
            servico.setEstado(rs.getString("estado"));
            servico.setDataFechada(rs.getString("data_fechada"));
            servicos.add(servico);
            }
            return servicos;
        } catch (SQLException ex) {
            Logger.getLogger(OrdemServicoBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
     }
     public List<OrdemDeServicoDTO> listaFechada(){
        try {
            sql = "SELECT * FROM tb_os  WHERE estado = 'Fechado';";
            List<OrdemDeServicoDTO> servicos =new ArrayList<>();
            ResultSet rs = null;
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
            OrdemDeServicoDTO servico = new OrdemDeServicoDTO();
            servico.setId_os(rs.getInt("id_os"));
            servico.setData_os(rs.getString("data_os"));
            servico.setServico(rs.getString("servico"));
            servico.setEmpresa(rs.getString("empresa"));
            servico.setSolicitante(rs.getString("solicitante"));
            servico.setResponsavel(rs.getString("responsavel"));
            servico.setValor(rs.getDouble("valor"));
            servico.setDescricao(rs.getString("descricao"));
            servico.setEstado(rs.getString("estado"));
            servico.setDataFechada(rs.getString("data_fechada"));
            servicos.add(servico);
            }
            return servicos;
        } catch (SQLException ex) {
            Logger.getLogger(OrdemServicoBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
     }
     
     public void fecharOS(OrdemDeServicoDTO os){
         sql="UPDATE tb_os SET data_os=?,servico=?,empresa=?,solicitante=?,responsavel=?,valor=?,descricao=?,estado=?,data_fechada=? WHERE id_os=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, os.getData_os());
            ps.setString(2, os.getServico());
            ps.setString(3, os.getEmpresa());
            ps.setString(4, os.getSolicitante());
            ps.setString(5, os.getResponsavel());
            ps.setDouble(6, os.getValor());
            ps.setString(7, os.getDescricao());
            ps.setString(8, os.getEstado());
            ps.setString(9, os.getDataFechada());
            ps.setInt(10, os.getId_os());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrdemServicoBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     } 
}
