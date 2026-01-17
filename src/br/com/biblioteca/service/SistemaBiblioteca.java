package br.com.biblioteca.service;

import br.com.biblioteca.model.Livro;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Classe responsável por gerenciar as operações da biblioteca.
 */
public class SistemaBiblioteca {
    private List<Livro> livros;

    public SistemaBiblioteca() {
        this.livros = new ArrayList<>();
    }

    /**
     * Adiciona um livro ao sistema.
     * @param livro O livro a ser adicionado.
     */
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    /**
     * Lista todos os livros cadastrados no sistema e seus status.
     */
    public void listarLivros() {
        System.out.println("\n--- Lista de Livros ---");
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
        System.out.println("-----------------------\n");
    }

    /**
     * Realiza o empréstimo de um livro pelo seu ISBN.
     * @param isbn O ISBN do livro desejado.
     * @return true se o empréstimo foi bem-sucedido, false caso contrário.
     */
    public boolean emprestarLivro(String isbn) {
        Optional<Livro> livroOp = encontrarLivroPorIsbn(isbn);

        if (livroOp.isPresent()) {
            Livro livro = livroOp.get();
            if (livro.isDisponivel()) {
                livro.setDisponivel(false);
                System.out.println("Empréstimo realizado com sucesso: " + livro.getTitulo());
                return true;
            } else {
                System.out.println("Falha no empréstimo: O livro '" + livro.getTitulo() + "' já está emprestado.");
            }
        } else {
            System.out.println("Falha no empréstimo: Livro com ISBN " + isbn + " não encontrado.");
        }
        return false;
    }

    /**
     * Realiza a devolução de um livro pelo seu ISBN.
     * @param isbn O ISBN do livro a ser devolvido.
     * @return true se a devolução foi bem-sucedida, false caso contrário.
     */
    public boolean devolverLivro(String isbn) {
        Optional<Livro> livroOp = encontrarLivroPorIsbn(isbn);

        if (livroOp.isPresent()) {
            Livro livro = livroOp.get();
            if (!livro.isDisponivel()) {
                livro.setDisponivel(true);
                System.out.println("Devolução realizada com sucesso: " + livro.getTitulo());
                return true;
            } else {
                System.out.println("O livro '" + livro.getTitulo() + "' já está disponível no sistema.");
            }
        } else {
            System.out.println("Falha na devolução: Livro com ISBN " + isbn + " não encontrado.");
        }
        return false;
    }

    /**
     * Busca um livro no sistema pelo ISBN.
     * @param isbn O ISBN a ser buscado.
     * @return Um Optional contendo o livro se encontrado.
     */
    private Optional<Livro> encontrarLivroPorIsbn(String isbn) {
        return livros.stream()
                .filter(l -> l.getIsbn().equals(isbn))
                .findFirst();
    }
}
