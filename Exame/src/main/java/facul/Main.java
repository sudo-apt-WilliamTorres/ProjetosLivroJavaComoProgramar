package facul;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int aprovados = 0;
        int reprovados = 0;
        int count = 1;
        int entrada = 0;

        while(count <= 10){
            entrada = 0;

            System.out.println("Insira o resultado (1 ou 2):");
            entrada = input.nextInt();

            if(entrada == 1){
                aprovados++;
            }
            else{
                reprovados++;
            }
            count++;
        }

        if(aprovados >= 8){
            System.out.printf("%nAprovados: %d%n", aprovados);
            System.out.printf("Reprovados: %d%n", reprovados);
            System.out.println("Bonus para o instrutor!");
        }
        else{
            System.out.printf("%nAprovados: %d%n", aprovados);
            System.out.printf("Reprovados: %d%n", reprovados);
            System.out.println("Sem bônus para o instrutor!");
        }
    }
}