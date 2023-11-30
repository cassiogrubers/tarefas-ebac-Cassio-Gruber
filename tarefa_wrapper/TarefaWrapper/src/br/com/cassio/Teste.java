package br.com.cassio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
       int numero = scanner.nextInt();
       for(int i=0;i<=10; i++){
           System.out.println(numero+" x "+i+" = "+numero*i);
           if (i==4){
               break;
           }
       }
    }
}
