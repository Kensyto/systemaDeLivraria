package br.com.biblioteca.model;

/**
 * Representa um livro no sistema da biblioteca.
 */
public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    /**
     * Construtor da classe Livro.
     * @param titulo O título do livro.
     * @param autor O autor do livro.
     * @param isbn O ISBN (identificador único) do livro.
     */
    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true; // Por padrão, o livro começa como disponível
    }

    // Getters e Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        String status = disponivel ? "Disponível" : "Emprestado";
        return String.format("Título: %-20s | Autor: %-20s | ISBN: %-15s | Status: %s",
                titulo, autor, isbn, status);
    }
}
