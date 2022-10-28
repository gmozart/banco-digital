package model;

public class ContaCorrente extends Conta{
    private String tpConta = "CC";
    public  ContaCorrente(){
        super();
        this.tpConta = tpConta;

    }
    @Override
    public void imprimirExtrato() {
       System.out.println("===== Extrato Conta Corrente =====");
    }


}
