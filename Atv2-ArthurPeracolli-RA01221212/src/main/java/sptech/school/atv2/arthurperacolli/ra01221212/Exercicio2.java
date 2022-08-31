package sptech.school.atv2.arthurperacolli.ra01221212;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        System.out.println("Insira um número");
        Integer numero = usuario.nextInt();

        for (int i = numero; i <= 90; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

}
