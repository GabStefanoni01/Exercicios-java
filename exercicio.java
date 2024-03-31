import java.util.Scanner;
 
public class exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Digite um número inteiro:");
        int valor = scanner.nextInt();
       
        int[] notas = {200, 100, 50, 20, 10, 5, 2, 1};
       
        int contadorNotas = 0;
       
        // Loop para contar o número de notas necessárias
        for (int i = 0; i < notas.length; i++) {
            contadorNotas += valor / notas[i]; // Adiciona a quantidade de notas ao contador
            valor %= notas[i]; // Atualiza o valor restante
        }
       
        // Exibindo o resultado
        System.out.println("O número mínimo de notas necessárias é: " + contadorNotas + " notas");
       
        scanner.close();
    }
}