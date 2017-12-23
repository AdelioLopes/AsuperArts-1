package br.com.AsuperArts.DTO;

import java.util.Objects;

/**
 * @author Aluno Gabriel Duarte Maranhao
 */
public class LoginDTO {
       private Integer id_login;
       private String usuario;
       private String senha;
       private Integer tipoUser;

    public Integer getId_login() {
        return id_login;
    }

    public void setId_login(Integer id_login) {
        this.id_login = id_login;
    }

    
    public Integer getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(Integer tipoUser) {
        this.tipoUser = tipoUser;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id_login);
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
        final LoginDTO other = (LoginDTO) obj;
        if (!Objects.equals(this.id_login, other.id_login)) {
            return false;
        }
        return true;
    }
       
       
}
