package sptech.school.atv2.arthurperacolli.ra01221212;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Insira um número de 1 a 100");
        Integer num = user.nextInt();
        Integer sort = 0;
        Integer firstTime = 0;
        Integer par = 0;
        Integer impar = 0;
        
        for (int i = 0; i < 200; i++) {
            sort = ThreadLocalRandom.current().nextInt(0, 100);
            
            if (sort % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        
        String frase = String.format("O seu numero foi sorteado na %dº rodada,"
                + " %d pares foram sorteados e %d impares foram sorteados", firstTime, par, impar);

        System.out.println(frase);
    }
}
