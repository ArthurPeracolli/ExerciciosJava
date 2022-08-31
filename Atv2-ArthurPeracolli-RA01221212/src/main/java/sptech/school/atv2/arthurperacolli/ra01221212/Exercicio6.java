package sptech.school.atv2.arthurperacolli.ra01221212;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Insira um número");
        Integer number = user.nextInt();
        Integer sort = 0;
        Integer contador = 0;

        while (number != sort) {
            sort = ThreadLocalRandom.current().nextInt(0, 10);
            System.out.println(sort);
            contador++;
        }

        if (contador <= 3) {
            System.out.println("Você é MUITO sortudo");
        } else if (contador <= 10) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }

}
