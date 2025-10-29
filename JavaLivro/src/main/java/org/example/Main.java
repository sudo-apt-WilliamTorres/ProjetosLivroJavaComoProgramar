package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class  Main{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, produto;

        System.out.println("Digite um número: ");
        num1 = input.nextInt();
        System.out.println("Digite um segundo número");
        num2 = input.nextInt();
        System.out.println("Digite um terceiro número: ");
        num3 = input.nextInt();

        produto = num1 * num2 * num3;

        System.out.println("O resultado do produto dos três número é "+ produto);
    }

}