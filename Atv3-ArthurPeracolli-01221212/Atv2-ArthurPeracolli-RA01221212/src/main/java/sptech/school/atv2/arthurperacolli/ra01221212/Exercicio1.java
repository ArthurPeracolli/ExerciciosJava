package sptech.school.atv2.arthurperacolli.ra01221212;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner usuario = new Scanner (System.in);
        System.out.println("Insira um número: ");
        Integer numero = usuario.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            
          Integer tabuada = numero * i;
          
            System.out.println(numero + " x " + i + " = " + tabuada);
        }
        
    }
 
}
