
package br.com.AsuperArts.DTO;

/**
 *
 * @author Equipe Senac 2017
 */
public class EstoqueDTO {
    private Integer idEstoque;
    private String nome;
    private String cor;
    private Integer espessura;
    private Integer comprimento;
    private Integer largura;
    private Integer valorCompra;
    private Integer valorCm;

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

    public Integer getEspessura() {
        return espessura;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }

    public Integer getComprimento() {
        return comprimento;
    }

    public void setComprimento(Integer comprimento) {
        this.comprimento = comprimento;
    }

    public Integer getLargura() {
        return largura;
    }

    public void setLargura(Integer largura) {
        this.largura = largura;
    }

    public Integer getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Integer valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Integer getValorCm() {
        return valorCm;
    }

    public void setValorCm(Integer valorCm) {
        this.valorCm = valorCm;
    }

    @Override
    public String toString() {
        return getNome(); //To change body of generated methods, choose Tools | Templates.
    }

  

   

    

    
    
    
}
