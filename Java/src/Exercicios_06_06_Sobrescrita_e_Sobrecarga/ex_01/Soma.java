package Exercicios_06_06_Sobrescrita_e_Sobrecarga.ex_01;

abstract Soma extends Operacao{
    @Override
    public double calcular() {
        resultado = a + b;
        return resultado;
    }
}
