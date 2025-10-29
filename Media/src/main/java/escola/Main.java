package escola;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        int notaCount = 0;

        System.out.println("Coloque a nota ou digite -1 para sair: ");
        int nota = input.nextInt();

        while (nota != -1)
        {

            total = total + nota;
            notaCount++;

            System.out.println("Coloque a nota ou digite -1 para sair: ");
            nota = input.nextInt();
        }

        if(notaCount != 0) {
            double media = (double) total / notaCount;
            System.out.printf("%nNota total %d de %d alunos.%n", total, notaCount);
            System.out.printf("A media da turma %.2f%n", media);
        }
        else{
            System.out.println("Nenhuma nota cadastrada.");
        }
    }
}