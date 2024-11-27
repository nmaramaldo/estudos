import java.util.Scanner;

public class VerificarParOuImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar um número ao usuário
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        //Verificar se o número é par ou ímpar
        if (numero % 2 == 0) {
        System.out.println("O número " + numero + " é par.");
        } else{
            System.out.println("O número " + numero + " é ímpar.");
        }

        scanner.close();

    }
}