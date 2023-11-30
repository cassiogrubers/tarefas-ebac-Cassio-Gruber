package br.com.cassio;

public class TiposPrimitivos {
    public static void main(String args[]){
        /*Casting explícito, pegando 64 bits e colocando em 8 bits*/
        long num1 = 1111;
        byte b1 = (byte) num1;
        System.out.println(b1);

        /*Casting implícito, pegando 8 bits e colocando em 32 bits*/
        byte b2 = 1;
        int numero = b2;
        System.out.println(b2);
    }
}
