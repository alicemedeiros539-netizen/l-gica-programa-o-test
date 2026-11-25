import java.util.Scanner;
public class exercicio12 {
 public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);

    double[][] notas = new double[3][2];
    double totalGeral=0;

    for (int aluno= 0; aluno<3; aluno++){
        System.out.println("---Aluno" + (aluno+1) + "---");
        for (int disc=0; disc<2; disc++) {
            System.out.println("Digite a nota da disciplina" +(disc+1) + ": ");
            notas[aluno] [disc] = scanner.nextDouble();
        }
    }

    System.out.println("\n===RESULTADOS===");

    for (int aluno=0; aluno<3; aluno++) {
        double somaAluno=0;

        for (int disc =0; disc <2; disc++) {
            somaAluno+= notas[aluno][disc];
        }
        System.out.printf("Soma das notas do Aluno %d: %.2f%n", (aluno+1), somaAluno);
        totalGeral+= somaAluno;
    }
    System.out.printf("\nTotal geral de todas as notas: %.2f%n", totalGeral);

    scanner.close();
 }
}
