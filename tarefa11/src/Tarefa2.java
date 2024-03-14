import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tarefa2 {
    List genFeminino = new ArrayList<>();
    List genMasculino = new ArrayList<>();
    List listaPessoas = new ArrayList<>();



    void separaGenero(){
        System.out.print("Digite o nome e o genero! (nome -m/f,) ");
        Scanner scanner = new Scanner(System.in);
        String linha = scanner.nextLine();
        String[] nome = linha.split(",");
        Collections.addAll(listaPessoas, nome);
        for (int i = 0; i < listaPessoas.size(); i++) {
            String listaNomes = listaPessoas.get(i).toString();
            String[] nomes = listaNomes.split("-");

            if (nomes[1].equals("m")) {
                genMasculino.add(nomes[0]);
            } else if (nomes[1].equals("f")){
                genFeminino.add(nomes[0]);
            }
        }
    }

    void ordenaListas(){
        Collections.sort(genFeminino);
        Collections.sort(genFeminino);
        Collections.sort(listaPessoas);
    }

    void imprimeListas(){
        System.out.println("Lista original: " + listaPessoas);
        System.out.println("Nomes femininos: " + genFeminino);
        System.out.println("Nomes masculinos: " + genMasculino);
    }
    public static void main(String[] args) {
        Tarefa2 tarefa2 = new Tarefa2();
        tarefa2.separaGenero();
        tarefa2.ordenaListas();
        tarefa2.imprimeListas();
    }
}