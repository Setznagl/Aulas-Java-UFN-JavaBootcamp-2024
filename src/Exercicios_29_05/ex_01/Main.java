package Exercicios_29_05.ex_01;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner LerDados = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                Bem vindo ao sistema de cadastro de livros
                O que deseja realizar?\s
                1- Cadastrar Livros
                2- Listar Livros
                """);

        int Selecionado = LerOpcao();
        System.out.println("Foi selecionado a opção " + Selecionado);

        if (Selecionado == 1){
            System.out.println("Digite nome, autor, editora, ano de publicação e preço");
                Livro livro1 = new Livro();
                Biblioteca.AdicionarLivro(livro1);
            System.out.println("Digite nome, autor, editora, ano de publicação e preço");
                Livro livro2 = new Livro();
                Biblioteca.AdicionarLivro(livro2);
            System.out.println("Digite nome, autor, editora, ano de publicação e preço");
                Livro livro3 = new Livro();
                Biblioteca.AdicionarLivro(livro3);

            Biblioteca.exibirLivros();
        }
    }

    static int LerOpcao() {
        int Opcao = LerDados.nextInt();
        System.out.println("Você selecionou " + Opcao + ", Deseja alterar? \n" + "1 - Alterar\n" + "2 - Manter");
        int Confirmacao = LerDados.nextInt();
            while (Confirmacao == 1) {
                System.out.println("""
                        Bem vindo ao sistema de cadastro de livros
                        O que deseja realizar?\s
                        1- Cadastrar Livros
                        2- Listar Livros
                        """);
                Opcao = LerDados.nextInt();
                System.out.println("Você selecionou " + Opcao + ", Deseja alterar? \n" + "1 - Alterar\n" + "2 - Manter");
                Confirmacao = LerDados.nextInt();
            }
        return Opcao;
    }
}