package sptech.school.atv2.arthurperacolli.ra01221212;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Insira um número: ");
        Integer num = user.nextInt();
        Integer total = 0;

        while (num != 0) {
            total += num;
            System.out.println("Insira um número: ");
            num = user.nextInt();
        }
        
        System.out.println("O seu total é: ");
        System.out.println(total);

    }
};
