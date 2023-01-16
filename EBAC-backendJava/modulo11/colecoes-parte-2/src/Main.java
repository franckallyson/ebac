import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String op;
        String nome, sexo;

        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        do {

            System.out.println("\n\n******   Grupo de Pessoas   ******");
            System.out.print("Digite o nome da pessoa: ");
            nome = scan.next();

            while (true) {
                System.out.print("Digite o sexo da pessoa [M, F]: ");
                sexo = scan.next().toUpperCase();

                if(sexo.equals("M") || sexo.equals("F"))
                    break;

                System.out.println("Digite 'M' ou 'F'!\n");
            }

            if(sexo.equals("M")){
                masculino.add(nome);
            }
            else {
                feminino.add(nome);
            }

            while(true) {
                System.out.print("\nDeseja adicionar mais alguém? [S/N]: ");
                op = scan.next().toUpperCase();

                if(op.equals("S") || op.equals("N"))
                    break;

                System.out.println("Digite 'S' ou 'N'! ");
            }


        }while(op.equals("S"));

        System.out.println(masculino);
        System.out.println(feminino);

    }
}