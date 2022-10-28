package model;

public abstract class Conta implements ContaInterface {
    private int agencia;
    private int numero;
    private double saldo;
    @Override
    public void sacar(Double valor) {

    }
    @Override
    public void depositar(Double valor) {

    }
    @Override
    public void transferir(Double valor, Conta contaDestino) {

    }

    @Override
    public void linhaCredito(Double valor, String tipoConta) {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
