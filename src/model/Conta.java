package model;

public abstract class Conta implements ContaInterface {

    private static final int AGENCIA_PADRAO = 1000;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected double credito;

    protected String tpConta;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }


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

    public void linhaCredito(String tipoConta) {

        if(tipoConta == "CC"){
            credito += 5000;
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
