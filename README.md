import java.util.Scanner;

public class CalcMedia {


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double somaNotas = 0;
    int alunosAprovados = 0;
    int alunosExame = 0;
    int alunosReprovados = 0;
    for (int i = 1; i <= 6; i++) {
        System.out.println("Digite as notas do aluno" + i + ":");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;
        somaNotas += media;

        System.out.println("Média do aluno " + i + ": " + media);

        if(media < 3.0) {
            System.out.println("Reprovado");
            alunosReprovados++;
        } else if (media >= 3.0 && media < 7.0) {
            System.out.println("Exame");
            alunosExame++;
        } else {
            System.out.println("Aprovado");
            alunosAprovados++;
        }
     }
     System.out.println("Total de alunos aprovados: " + alunosAprovados);
     System.out.println("Total de alunos de exame: " + alunosExame);
     System.out.println("Total de alunos reprovados: " + alunosReprovados);

     double mediaClasse = somaNotas / 6;
     System.out.println("Média da classe: " + mediaClasse);

     scanner.close();
    
    }
}
