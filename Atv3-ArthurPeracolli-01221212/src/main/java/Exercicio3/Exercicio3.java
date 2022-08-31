package Exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Insira a sua idade ");
        Integer idade = user.nextInt();

        VoidIdade voidIdade = new VoidIdade();

        voidIdade.faixaEtaria(idade);

    }
}
