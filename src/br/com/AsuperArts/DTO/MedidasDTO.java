package br.com.AsuperArts.DTO;




/**
 *
 * @author Equipe Senac 2017
 */
public class MedidasDTO {
    private Integer id_medidas;
    private Integer largura;
    private Integer comprimento;
    private Integer hora;
    private Integer tamanho;
    private Integer peso;

    public Integer getId_medidas() {
        return id_medidas;
    }

    public void setId_medidas(Integer id_medidas) {
        this.id_medidas = id_medidas;
    }

    public Integer getLargura() {
        return largura;
    }

    
    public void setLargura(Integer largura) {
        this.largura = largura;
    }

    public Integer getComprimento() {
        return comprimento;
    }

    public void setComprimento(Integer comprimento) {
        this.comprimento = comprimento;
    }

    
    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

            
}
