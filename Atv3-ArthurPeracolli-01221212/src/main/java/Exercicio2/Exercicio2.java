package Exercicio2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Insira a sua renda ");
        Double rendaInicial = user.nextDouble();

        CalculoRenda calculoRenda = new CalculoRenda();

        Double qtdSalarios = calculoRenda.rendaDividida(rendaInicial);

        String classe = calculoRenda.classeSocial(qtdSalarios);

        System.out.printf("Você pertence a %s e sua quantidade de" +
                " salários é %.2f", classe, qtdSalarios);
    }
}
