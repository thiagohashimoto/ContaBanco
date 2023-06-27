package org.digitalinnovationone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta conta1 = new Conta();

        System.out.print("Por favor, insira o número da Conta Corrente: ");
        conta1.setContacorrente(sc.nextInt());

        System.out.print("Por favor, digite o número da Agência: ");
        conta1.setAgencia(sc.next());

        System.out.print("Por favor, insira o nome completo: ");
        conta1.setNomeCliente(sc.next());

        System.out.print("Nos informe seu Saldo: ");
        conta1.setSaldo(sc.nextDouble());

        System.out.println("Olá " + conta1.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta1.getAgencia() + ", conta " + conta1.getContacorrente() + " e seu saldo " + conta1.getSaldo() + " já está disponível para saque");

    }
}
