package Exercicios_29_05.ex_02;
import java.util.Scanner;

public class Aluno {
    private String NomeAluno;
    private int IdadeAluno;
    private int MatriculaAluno;

    Scanner LerDados = new Scanner(System.in);

    protected Aluno(){
        this.NomeAluno = LerDados.nextLine();
        this.IdadeAluno = LerDados.nextInt();
        this.MatriculaAluno = LerDados.nextInt();
    }

    @Override
    public String toString(){
        return "Registro de Aluno\n"+
                "Nome :" + "  " + NomeAluno + "  " +
                "Idade :" + "  " + IdadeAluno + "  " +
                "Matrícula :" + "  " + MatriculaAluno + "  " + "\n";
    }

}
