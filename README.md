# Sistema de Gerenciamento de Empréstimos de Biblioteca

Este é um sistema simples de gerenciamento de biblioteca desenvolvido em Java, focado em demonstrar conceitos fundamentais de Orientação a Objetos e manipulação de coleções em memória.

## 🚀 Funcionalidades

O sistema permite as seguintes operações:
- **Listagem de Livros**: Exibe todos os livros cadastrados com título, autor, ISBN e status de disponibilidade.
- **Empréstimo de Livros**: Permite que um usuário realize o empréstimo de um livro disponível. O sistema atualiza automaticamente o status para 'Emprestado'.
- **Devolução de Livros**: Permite a devolução de um livro, tornando-o 'Disponível' novamente para outros usuários.

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java 17+
- **Paradigma**: Orientação a Objetos (OO)
- **Armazenamento**: Coleções em memória (`ArrayList`)

## 📋 Estrutura do Projeto

O projeto está organizado nos seguintes pacotes:
- `br.com.biblioteca.model`: Contém as classes de modelo (`Livro`, `Usuario`).
- `br.com.biblioteca.service`: Contém a lógica de negócio do sistema (`SistemaBiblioteca`).
- `br.com.biblioteca.main`: Contém a classe principal para execução e demonstração.

## ⚙️ Como Executar

Para rodar o projeto localmente, siga os passos abaixo:

1. **Pré-requisitos**:
   - Ter o JDK 17 ou superior instalado.

2. **Compilação**:
   Abra o terminal na raiz do projeto e execute:
   ```bash
   javac -d bin src/br/com/biblioteca/model/*.java src/br/com/biblioteca/service/*.java src/br/com/biblioteca/main/*.java
   ```

3. **Execução**:
   Após a compilação, execute o comando:
   ```bash
   java -cp bin br.com.biblioteca.main.Main
   ```

