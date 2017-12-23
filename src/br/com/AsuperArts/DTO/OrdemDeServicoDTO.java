package br.com.AsuperArts.DTO;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Gabriel Duarte
 */
public class OrdemDeServicoDTO {
    private Integer id_os;
    private String cliente;
    private Date data_os;
    private Integer numero_os;
    private String tipo_os;
    private Date dt_entrada;
    private Date dt_saida;
    private String empresa;
    private String solicitante;
    private String responsavel;
    private String arquivo;
    private String produto;
    private Integer quantidade;
    private Double valorUnitario;  
    private Double valorTotalProduto;
    private Double valorOs;

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

    public Integer getNumero_os() {
        return numero_os;
    }

    public void setNumero_os(Integer numero_os) {
        this.numero_os = numero_os;
    }

    public String getTipo_os() {
        return tipo_os;
    }

    public void setTipo_os(String tipo_os) {
        this.tipo_os = tipo_os;
    }

    public Date getDt_entrada() {
        return dt_entrada;
    }
    
    public void setDt_entrada(Date dt_entrada) {
        this.dt_entrada = dt_entrada;
    }

    public Date getDt_saida() {
        return dt_saida;
    }

    public void setDt_saida(Date dt_saida) {
        this.dt_saida = dt_saida;
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

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorTotalProduto() {
        return valorTotalProduto;
    }

    public void setValorTotalProduto(Double valorTotalProduto) {
        this.valorTotalProduto = valorTotalProduto;
    }

    public Double getValorOs() {
        return valorOs;
    }

    public void setValorOs(Double valorOs) {
        this.valorOs = valorOs;
    }


        
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id_os);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrdemDeServicoDTO other = (OrdemDeServicoDTO) obj;
        if (!Objects.equals(this.id_os, other.id_os)) {
            return false;
        }
        return true;
    }


    
}
