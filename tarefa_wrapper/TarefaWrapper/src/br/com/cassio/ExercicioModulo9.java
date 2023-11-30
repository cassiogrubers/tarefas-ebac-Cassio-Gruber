package br.com.cassio;

import java.util.Scanner;

public class ExercicioModulo9 {
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe um número: ");
    int a = scanner.nextInt();
    Integer b = a;
    System.out.println("Wrapper: "+b);
    scanner.close();
    }
}