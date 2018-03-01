/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.AsuperArts.DTO;

/**
 *
 * @author Administrador
 */
public class ServicosDTO {
    private Integer id_servico;
    private String servico;
    private Double valorH;
    private Double valorI;
    private Integer metro;
    public Integer getId_servico() {
        return id_servico;
    }

    public void setId_servico(Integer id_servico) {
        this.id_servico = id_servico;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public Double getValorH() {
        return valorH;
    }

    public void setValorH(Double valorH) {
        this.valorH = valorH;
    }

    public Double getValorI() {
        return valorI;
    }

    public void setValorI(Double valorI) {
        this.valorI = valorI;
    }
    public Integer getMetro() {
        return metro;
    }

    public void setMetro(Integer metro) {
        this.metro = metro;
    }
    
    
    
}
