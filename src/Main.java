import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Cliente jose = new Cliente();
        jose.setNome("jose");
        Cliente ariston = new Cliente();
        ariston.setNome("ariston");

        Conta cc = new ContaCorrente(jose);
        Conta cp = new ContaPoupanca(ariston);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}