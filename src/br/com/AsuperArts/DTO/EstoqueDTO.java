
package br.com.AsuperArts.DTO;

/**
 *
 * @author Equipe Senac 2017
 */
public class EstoqueDTO {
    private Integer idEstoque;
    private String nome;
    private String cor;
    private Double espessura;
    private Double comprimento;
    private Double largura;
    private Double valorCompra;
    private Double valorCm;

    public Integer getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(Integer idEstoque) {
        this.idEstoque = idEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getEspessura() {
        return espessura;
    }

    public void setEspessura(Double espessura) {
        this.espessura = espessura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Double getValorCm() {
        return valorCm;
    }

    public void setValorCm(Double valorCm) {
        this.valorCm = valorCm;
    }
    
    
}
