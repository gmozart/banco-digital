package model;

public class ContaPoupanca extends Conta {
    private String tpConta = "PP";
    @Override
    public void imprimirExtrato() {
        System.out.println("===== Extrato Conta Poupanca =====");
        super.linhaCredito(tpConta);
        super.impInfoConta();
    }
}
