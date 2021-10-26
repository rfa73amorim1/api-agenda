package br.com.rfa73amorim1.agenda.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class ContatoEntity {
    @Id // anotação da chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)// Define como será a geração do id.
    private Long id;

    @Column (nullable = false) // a coluna não pode ser nula.
    private String  nome;

    @Column (nullable = false)
    private String  telefone;

    @Column (nullable = false)
    private String  email;

    private String urlAvatar;

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContatoEntity that = (ContatoEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrlAvatar() {
        return urlAvatar;
    }

    public void setUrlAvatar(String urlAvatar) {
        this.urlAvatar = urlAvatar;
    }


}
