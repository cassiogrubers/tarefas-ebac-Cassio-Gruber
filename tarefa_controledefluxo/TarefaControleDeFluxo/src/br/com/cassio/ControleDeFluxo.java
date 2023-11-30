package br.com.cassio;

import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1,n2,n3,n4;

        float media;

        System.out.println("Digite a nota 1");
        n1 = s.nextInt();
        System.out.println("Digite a nota 2");
        n2 = s.nextInt();
        System.out.println("Digite a nota 3");
        n3 = s.nextInt();
        System.out.println("Digite a nota 4");
        n4 = s.nextInt();

        media = (n1+n2+n3+n4)/4;

        if(media>=7){
            System.out.println("Aprovado! "+media);
        }else if(media>=5 && media<7){
            System.out.println("Recuperação! "+media);

        }else if(media<5){
            System.out.println("Reprovado! "+media);
        }
    }
}
