import java.util.Scanner;
public class exercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int [10];
        int pares = 0, impares= 0, soma = 0;

        System.out.println("Digite 10 numeros inteiros:");
        for (int i = 0; i< 10; i++) {
            numeros[i]= sc.nextInt();
            soma+=numeros[i];

            if (numeros[i] % 2==0) {
                pares++;
            }else {
                impares++;
            }

        }
        System.out.println("\nNumeros: ");
        for (int n : numeros){
            System.out.println(n + " ");
        }

        System.out.println("\nPares: " + pares);
        System.out.println("\nImpares: " + impares);
        System.out.println("\nSoma: " + soma);

        sc.close();
    }
}