package sptech.school.atv2.arthurperacolli.ra01221212;

import java.util.Scanner;

public class Exercicio5 {
    
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        
        System.out.println("Insira o seu usuario: ");
        String login = user.next();
        
        System.out.println("Insira o sua senha: ");
        String senha = user.next();
        
        while (!login.equals("admin") && !senha.equals("#SPtech2022")) {
            System.out.println("Insira o seu usuario: ");
            login = user.nextLine();
            
            System.out.println("Insira o sua senha: ");
            senha = user.nextLine();
        }
        
        System.out.println("Login realizado com sucesso");
        
    }
    
}
