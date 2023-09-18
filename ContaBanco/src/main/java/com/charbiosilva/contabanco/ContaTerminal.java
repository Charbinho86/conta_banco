/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.charbiosilva.contabanco;

import java.util.Scanner;

/**
 *
 * @author charb
 */
public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String agencia;
        String nomeCliente;
        int numeroConta;
        Double saldo = 1000.00;
        
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = leitor.next();
        System.out.print("Por favor, digite o Número da Conta: ");
        numeroConta = leitor.nextInt();
        System.out.print("Por favor, digite o Nome do Cliente: ");
        nomeCliente = leitor.nextLine();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, "
                + "sua Agência é %s, Conta %s e seu Saldo R$ %.2f já está disponível "
                + "para saque.", nomeCliente, agencia, numeroConta, saldo);
    }
}
