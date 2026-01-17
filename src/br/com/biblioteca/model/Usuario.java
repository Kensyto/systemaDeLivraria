package br.com.biblioteca.model;

/**
 * Representa um usuário do sistema de biblioteca.
 */
public class Usuario {
    private String nome;
    private String id;

    /**
     * Construtor da classe Usuario.
     * @param nome O nome do usuário.
     * @param id O identificador único do usuário.
     */
    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuário: " + nome + " (ID: " + id + ")";
    }
}
