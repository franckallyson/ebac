import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParteDois {
    public static void main(String[] args){
        List<String> pessoasMarculino = new ArrayList<>();
        List<String> pessoasFeminino = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("**** Parte Um do Módulo 12 ****");
        System.out.println("ATENÇÃO: PADRÃO DE DIGITAÇÃO: Nome1-sexo1,nome2-sexo2");
        System.out.println("Digite os dados, para o sexo use M ou F.");
        System.out.print("--> ");

        String resposta = scan.next();
        String[] respostaSeparada = resposta.split(",");

        for (String nomeSexo : respostaSeparada){
            String[] dadoTemp = nomeSexo.split("-");

            if (dadoTemp[1].equals("M") || dadoTemp[1].equals("m")){
                pessoasMarculino.add(dadoTemp[0]);
            }
            else if (dadoTemp[1].equals("F") || dadoTemp[1].equals("f")){
                pessoasFeminino.add(dadoTemp[0]);
            }
            else {
                System.out.println("\nInformação incorreta para o nome " + dadoTemp[0] + ". Informação ignorada.");
            }
        }

        System.out.println("Homens: " + pessoasMarculino);
        System.out.println("Mulheres: " + pessoasFeminino);

    }
}
