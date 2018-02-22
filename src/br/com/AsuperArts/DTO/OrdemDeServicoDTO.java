package br.com.AsuperArts.DTO;

import java.math.BigDecimal;
import java.util.Date;


/**
 *
 * @author Equipe senac 2017
 */
public class OrdemDeServicoDTO {
    private Integer id_os;
    private String data_os;
    private String servico;
    private String empresa;
    private String solicitante;
    private String responsavel;
    private Double valor;
    private String Descricao;
    private String estado;
    private String dataFechada;
    public Integer getId_os() {
        return id_os;
    }

    public void setId_os(Integer id_os) {
        this.id_os = id_os;
    }

    public String getData_os() {
        return data_os;
    }

    public void setData_os(String data_os) {
        this.data_os = data_os;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDataFechada() {
        return dataFechada;
    }

    public void setDataFechada(String dataFechada) {
        this.dataFechada = dataFechada;
    }



    
    


    
}
