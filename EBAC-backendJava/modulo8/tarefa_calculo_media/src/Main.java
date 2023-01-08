import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int nota1, nota2, nota3, nota4, nota_total;
        float media;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a 1ª Nota: ");
        nota1 = scan.nextInt();

        System.out.print("Digite a 2ª Nota: ");
        nota2 = scan.nextInt();

        System.out.print("Digite a 3ª Nota: ");
        nota3 = scan.nextInt();

        System.out.print("Digite a 4ª Nota: ");
        nota4 = scan.nextInt();

        nota_total = nota1 + nota2 + nota3 + nota4;
        media = (float)(nota_total / 4);

        System.out.println("A média das 4 notas é: " + media);

    }
}