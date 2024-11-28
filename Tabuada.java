import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar o número aoo usuário
        System.out.println("Digite um número inteiro para ver a tabuada: ");
        int numero = scanner.nextInt();

        //Gerar a tabuada
        System.out.println("A tabuada do número " + numero + " é: ");
        for (int i = 1; i<10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero *i));
        }
        
        scanner.close();
    }
}
