package br.com.AsuperArts.DTO;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Equipe senac 2017
 */
public class FuncionarioDTO {
    private Integer id_funcionario;
    private String nome;
    private String dt_nascimento;
    private String email;

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

    public String getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
