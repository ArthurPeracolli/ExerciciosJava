package exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
    Scanner user = new Scanner(System.in);

        System.out.println("Insira uma nota ");
        Double firstNota = user.nextDouble();

        System.out.println("Insira outra nota ");
        Double secondNota = user.nextDouble();

        CalcularMedia calcularMedia = new CalcularMedia();

        Double mediaFinal = calcularMedia.calcular(firstNota, secondNota);

        System.out.println("Sua média final é de " + mediaFinal);
    }

}
