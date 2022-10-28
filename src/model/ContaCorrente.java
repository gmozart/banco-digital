package model;

public class ContaCorrente extends Conta{
    private String tpConta = "CC";

    @Override
    public void imprimirExtrato() {
       System.out.println("===== Extrato Conta Corrente =====");
       super.linhaCredito(tpConta);
       super.impInfoConta();
    }


}
