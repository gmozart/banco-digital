package model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente){
        super(cliente);

    }
    @Override
    public void imprimirExtrato() {
        System.out.println("===== Extrato Conta Poupanca =====");
        String tpConta = "PP";
        super.linhaCredito(tpConta);
        super.impInfoConta();
    }
}
