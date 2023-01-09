import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor numérico: ");
        int valor_numerico = scan.nextInt();

        int valor_numerico_wapper = Integer.valueOf(valor_numerico);

        System.out.println("A variavel é: " + valor_numerico);
    }
}