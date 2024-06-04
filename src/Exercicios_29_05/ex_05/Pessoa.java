package Exercicios_29_05.ex_05;
import java.util.Scanner;

public class Pessoa {
    Scanner LerDados = new Scanner(System.in);
    protected String nomePessoa;
    protected double salarioPessoa;

    protected Pessoa() {
        this.nomePessoa = LerDados.nextLine();
        this.salarioPessoa = LerDados.nextDouble();
    }

    @Override
    public String toString(){
        return  "Nome: "+ nomePessoa + " Salário: " + salarioPessoa;
    }
}
