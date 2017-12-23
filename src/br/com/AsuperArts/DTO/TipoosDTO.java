package br.com.AsuperArts.DTO;

import java.util.Objects;

/**
 * @author Aluno
 */
public class TipoosDTO {
    private Integer id_tipoOs;
    private String nome;

    public Integer getId_tipoOs() {
        return id_tipoOs;
    }

    public void setId_tipoOs(Integer id_tipoOs) {
        this.id_tipoOs = id_tipoOs;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id_tipoOs);
        return hash;
    }

    @Override
    public String toString() {
        return getNome().toString(); 
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
        final TipoosDTO other = (TipoosDTO) obj;
        if (!Objects.equals(this.id_tipoOs, other.id_tipoOs)) {
            return false;
        }
        return true;
    }
  
}
