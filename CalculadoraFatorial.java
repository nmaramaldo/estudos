import java.util.Scanner;

public class CalculadoraFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar um número ao usuário
        System.out.println("Digite um número inteiro não negativo: ");
        int numero = scanner.nextInt();

        // Calcular fatorial
        long fatorial = 1;
        if (numero < 0) {
            System.out.println("O fatorial não se aplica em números negativos.");
        } else {
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + numero + " é " + fatorial);
        }

        scanner.close();
    }
}
