import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ParteUm {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("**** Parte Um do Módulo 12 ****");
        System.out.println("Digite os nomes das pessoas separado por vírgula!");
        System.out.print("--> ");

        String resposta = scan.next();
        String[] nomesSeparados = resposta.split(",");

        Collections.addAll(nomes, nomesSeparados);

        Collections.sort(nomes);

        nomes.forEach(System.out::println);

    }
}
