package sptech.school.atv2.arthurperacolli.ra01221212;

import java.util.Scanner;
import static javax.management.Query.and;

public class Exercicio9 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroqueijos = 0;
        String maisVotado = "";

        for (int i = 0; i < 10; i++) {
            System.out.println("Qual a sua pizza favorita ??");
            Integer num = user.nextInt();

            switch (num) {
                case 5:
                    mussarela++;
                    break;
                case 25:
                    calabresa++;
                    break;
                default:
                    quatroqueijos++;
                    break;
            }
        }

        if (mussarela > calabresa) {
            maisVotado = "mussarela";
        } else if (calabresa > quatroqueijos) {
            maisVotado = "calabresa";
        } else if (quatroqueijos > mussarela) {
            maisVotado = "quatro queijos";
        }

        String frase = String.format("O sabor mussarela recebeu %d votos,"
                + " o sabor calabresa recebeu %d votos  e o sabor de quatro queijos"
                + " recebeu %d votos."
                + " \n O mais votado foi %s", mussarela, calabresa, quatroqueijos, maisVotado);

        System.out.println(frase);
    }
}
