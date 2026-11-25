public class exercicio3 {
    public static void main(String[] args) {
        
    String[]alunos= {"Ana", "Bruno", "Carla", "Diego"};
    double[][] notas= {
        {8,7.5,9},
        {5,6,4.5},
        {9.5,8,10},
        {3,4.5,6}
    };
    String[]disc= {"Lógica", "Banco de Dados", "Redes"};

    double media, maiorMedia=0;
    String nomeMaior="", sit;

    for (int i=0; i<4; i++) {
        media= (notas[i][0]+ notas[i][1]+ notas[i][2]) /3;

        if (media>=7) sit= "Aprovado";
        else if (media>=5) sit= "recuperação";
        else sit= "Reprovado";

        System.out.printf("%s: %.2f- %s\n", alunos[i], media, sit);

        if (media>maiorMedia) {
            maiorMedia= media;
            nomeMaior= alunos[i];
        }
    }

    System.out.println();
    for(int j=0; j<3; j++) {
        media= (notas[0][j] + notas[1][j] + notas[2][j] + notas[3][j])/4;
    }
    System.out.printf("\nMaior média: %s (%.2f)\n", nomeMaior, maiorMedia);
}
}
