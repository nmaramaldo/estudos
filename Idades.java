import java.util.Scanner;

public class Idades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos anos: ");
        int anos = scanner.nextInt();
        int anosEmDias = anos * 365;

        System.out.println("Digite quantos meses: ");
        int meses = scanner.nextInt();
        int mesesEmDias = meses * 30;

        System.out.println("Digite quantos dias: ");
        int dias = scanner.nextInt();

        int totalDias = anosEmDias + mesesEmDias + dias;

        System.out.println("A sua idade em dias é: " + totalDias);

        scanner.close();

    }
}