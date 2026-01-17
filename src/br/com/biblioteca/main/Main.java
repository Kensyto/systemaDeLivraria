package br.com.biblioteca.main;

import br.com.biblioteca.model.Livro;
import br.com.biblioteca.model.Usuario;
import br.com.biblioteca.service.SistemaBiblioteca;

/**
 * Classe principal para demonstração do Sistema de Gerenciamento de Empréstimos.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Gerenciamento de Biblioteca ===");

        // Inicialização do sistema
        SistemaBiblioteca biblioteca = new SistemaBiblioteca();

        // Cadastro de livros
        biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "978-01"));
        biblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis", "978-02"));
        biblioteca.adicionarLivro(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "978-03"));
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell", "978-04"));

        // Cadastro de usuário
        Usuario usuario = new Usuario("Maria Silva", "USR001");
        System.out.println("Bem-vinda, " + usuario.getNome() + "!");

        // Listagem inicial
        biblioteca.listarLivros();

        // Simulação de empréstimo
        System.out.println("Solicitando empréstimo do livro '1984' (ISBN: 978-04)...");
        biblioteca.emprestarLivro("978-04");

        // Listagem após empréstimo
        biblioteca.listarLivros();

        // Tentativa de empréstimo de um livro já emprestado
        System.out.println("Tentando emprestar '1984' novamente...");
        biblioteca.emprestarLivro("978-04");

        // Simulação de devolução
        System.out.println("\nDevolvendo o livro '1984'...");
        biblioteca.devolverLivro("978-04");

        // Listagem final
        biblioteca.listarLivros();
    }
}
