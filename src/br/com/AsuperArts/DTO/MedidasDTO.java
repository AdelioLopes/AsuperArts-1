package br.com.AsuperArts.DTO;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id_medidas);
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
        final MedidasDTO other = (MedidasDTO) obj;
        if (!Objects.equals(this.id_medidas, other.id_medidas)) {
            return false;
        }
        return true;
    }
    
    
            
}
