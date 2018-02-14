package br.com.AsuperArts.DTO;

import java.util.Date;


/**
 *
 * @author Equipe senac 2017
 */
public class OrdemDeServicoDTO {
    private Integer id_os;
    private String cliente;
    private Date data_os;
    private String empresa;
    private String solicitante;
    private String responsavel;
    private String servico;

    public Integer getId_os() {
        return id_os;
    }

    public void setId_os(Integer id_os) {
        this.id_os = id_os;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getData_os() {
        return data_os;
    }

    public void setData_os(Date data_os) {
        this.data_os = data_os;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    


    
}
