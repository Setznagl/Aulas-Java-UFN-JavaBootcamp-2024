package Exercicios_29_05.ex_03;
import java.util.Scanner;

public class Produto {
    private String NomeProduto;
    private double ValorUnitario;
    private int Quantidade;
    private double TotalItem;

    Scanner LerDados = new Scanner(System.in);

    protected Produto(){
        this.NomeProduto = LerDados.nextLine();
        this.Quantidade = LerDados.nextInt();
        this.ValorUnitario = LerDados.nextDouble();
        this.TotalItem = this.ValorUnitario * this.Quantidade;
    }

    @Override
    public String toString(){
        return  "Item :"+ NomeProduto + "R$" + ValorUnitario + "  " + Quantidade + "  R$" + TotalItem;
    }
}
