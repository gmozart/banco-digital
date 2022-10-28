package model;

public class ContaPoupanca extends Conta {

    private String tpConta = "PP";
    public  ContaPoupanca(){
        super();
        this.tpConta = tpConta;

    }
    @Override
    public void imprimirExtrato() {
        System.out.println("===== Extrato Conta Corrente =====");
    }
}
