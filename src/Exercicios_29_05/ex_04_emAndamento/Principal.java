package Exercicios_29_05.ex_04_emAndamento;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    protected static Scanner LerDados = new Scanner(System.in);
    protected static List<Paciente> ListaPacientes = new ArrayList<>();

    public static void main(String[] args) {

        fluxoDeEscolha();

    }

    static int LerOpcao() {
        int Opcao = LerDados.nextInt();
        System.out.println("Você selecionou " + Opcao + ", Deseja alterar? \n" + "1 - Alterar\n" + "2 - Manter");
        int Confirmacao = LerDados.nextInt();
        while (Confirmacao == 1) {
            System.out.println("""
                    Bem vindo ao sistema de cadastro de pacientes para cálculo de IMC.
                    O que deseja realizar?\s
                    1- Cadastrar paciente 
                    2- Calular IMC dos pacientes e exibir relatórios
                    3- Finalizar
                    """);
            Opcao = LerDados.nextInt();
            System.out.println("Você selecionou " + Opcao + ", Deseja alterar? \n" + "1 - Alterar\n" + "2 - Manter");
            Confirmacao = LerDados.nextInt();
        }
        return Opcao;
    }

    static void AdicionarPaciente(Paciente pacienteIterado){
        ListaPacientes.add(pacienteIterado);
    }

    static void fluxoDeEscolha() {
        System.out.println("""
                    Bem vindo ao sistema de cadastro de pacientes para cálculo de IMC.
                    O que deseja realizar?\s
                    1- Cadastrar paciente 
                    2- Calular IMC dos pacientes e exibir relatórios
                    3- Finalizar
                    """);

        int Selecionado = LerOpcao();
        System.out.println("Foi selecionado a opção " + Selecionado);

        switch (Selecionado) {
            case 1: {
                System.out.println("Digite um nome para o paciente ou deixe em branco e em" +
                        " seguida digite sua altura e peso respectivamente");
                // Adicionando produtos ao carrinho
                Paciente paciente1 = new Paciente();
                AdicionarPaciente(paciente1);
                System.out.println("Cadastrado com sucesso!");

                System.out.println("Pacientes cadastrados com sucesso");

                System.out.println("Deseja realizar outra função?\n 1- sim     2- não ");
                int AcaoAdicional = LerOpcao();
                if (AcaoAdicional == 1) {
                    fluxoDeEscolha();
                    break;
                }
                break;
            }
            case 2: {
                System.out.println("Método para saída");
                break;
            }
            default:
                break;
        }
    }
}
