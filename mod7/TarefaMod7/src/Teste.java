/*Classe principal main*/
public class Teste {
    public static void main(String args []){
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Pluto");
        String nome = cachorro.getNome();
        System.out.println(nome);
        cachorro.setCor("Marrom");
        System.out.println(cachorro.getCor());
        cachorro.latir();
        cachorro.andar();
        cachorro.dormir();
        cachorro.comer();
    }
}

