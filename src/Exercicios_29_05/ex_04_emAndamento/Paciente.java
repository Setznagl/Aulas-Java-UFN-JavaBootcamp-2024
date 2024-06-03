package Exercicios_29_05.ex_04_emAndamento;
import java.util.Scanner;

public class Paciente {
    static String NomePaciente;
    static double AlturaPaciente;
    static double PesoPaciente;

    Scanner LerDados = new Scanner(System.in);

    protected Paciente() {
        this.NomePaciente = setNome();
        this.AlturaPaciente = LerDados.nextDouble();
        this.PesoPaciente = LerDados.nextDouble();
    }

    protected String setNome(){return LerDados.nextLine();}

    @Override
    public String toString(){
        return  " "+ NomePaciente + " Altura: " + AlturaPaciente + " Peso: " + PesoPaciente;
    }
}
