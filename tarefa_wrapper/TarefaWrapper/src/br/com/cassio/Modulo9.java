package br.com.cassio;

import java.util.Scanner;

public class Modulo9 {
    public static void main(String args[]) {
        Scanner texto = new Scanner(System.in);
        String str;
        System.out.println("Entre com seu nome");
        str = texto.nextLine();
        System.out.println("informe o numero!");
        int numero = texto.nextInt();
        System.out.println("Bem vindo!" + str);
        System.out.println("Numero digitado " + numero);
        texto.close();
    }
}