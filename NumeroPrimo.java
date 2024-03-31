import java.util.Scanner;
public class NumeroPrimo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro maior que 1: ");
        int numero = scanner.nextInt();

        boolean ehprimo = true;

        if(numero <= 1) {
            System.out.println("Numero inválido. Por favor, digite um número inteiro maior que 1.");
         } else {}
         for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                ehprimo = false;
                break;
            }
         }
         if (ehprimo) {
            System.out.println(numero + "é um numero primo.");
        } else {
            System.out.println(numero + "Não é um numero primo");
        }
        scanner.close();
    }
}