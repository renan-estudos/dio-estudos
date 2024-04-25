package edu.renan.conta;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a agência da conta: ");
        String agencia = sc.next();
        sc.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Digite o saldo: ");
        Double saldo = sc.nextDouble();
        sc.close();

        ContaTerminal conta = new ContaTerminal(num, agencia, nomeCliente, saldo);

        conta.detalhar();
        }
    }
