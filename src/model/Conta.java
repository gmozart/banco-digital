package model;

public abstract class Conta implements ContaInterface {
    private int agencia;
    private int numero;
    private double saldo;
    private double credito;
    @Override
    public void sacar(Double valor) {
        saldo -= valor;
    }
    public void sacarCredito(Double valor) {
        credito -= valor;
    }
    @Override
    public void depositar(Double valor) {
        saldo += valor;
    }
    @Override
    public void transferir(Double valor, Conta contaDestino) {

    }

    @Override
    public void linhaCredito(Double valor, String tipoConta) {

        if(tipoConta == "CC"){
            credito += valor;
        }else {
            credito = 0;
        }
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
