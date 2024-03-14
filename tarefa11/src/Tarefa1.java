import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tarefa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        String linha = scanner.nextLine();
        String []itens = linha.split(",");
        Collections.addAll(lista,itens);
        Collections.sort(lista);
        System.out.println(lista);
        }
}
