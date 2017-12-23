package br.com.AsuperArts.DTO;

import java.util.Objects;

/**
 *
 * @author Equipe senac 2017
 */
public class FuncionarioDTO {
    private Integer id_funcionario;
    private String nome;

    public Integer getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Integer id_funcionario) {
        this.id_funcionario = id_funcionario;
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
        hash = 41 * hash + Objects.hashCode(this.id_funcionario);
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
        final FuncionarioDTO other = (FuncionarioDTO) obj;
        if (!Objects.equals(this.id_funcionario, other.id_funcionario)) {
            return false;
        }
        return true;
    }
   
}
