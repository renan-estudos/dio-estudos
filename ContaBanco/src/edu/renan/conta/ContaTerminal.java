package edu.renan.conta;

public class ContaTerminal {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public Double saldo;

    ContaTerminal(int numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    public void detalhar() {
        System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + ", conta " + this.numero + " e seu saldo " + this.saldo + " já está disponível para saque.");
    }
}
