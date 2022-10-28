package model;

public interface ContaInterface {

  void sacar(Double valor);
  void depositar(Double valor);
  void transferir(Double valor, Conta contaDestino);

  void linhaCredito(Double valor, String tipoConta);


}
