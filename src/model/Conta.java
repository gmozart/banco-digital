package model;

public class Conta implements ContaInterface {
    private int agencia;
    private int numero;
    private double saldo;

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(Double valor) {

    }

    @Override
    public void depositar(Double valor) {

    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {

    }
}
