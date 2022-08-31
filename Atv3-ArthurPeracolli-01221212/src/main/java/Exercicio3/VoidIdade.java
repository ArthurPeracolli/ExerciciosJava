package Exercicio3;

public class VoidIdade {
    void faixaEtaria (Integer idade){
        String result;

        if (idade <= 2){
            result = "Bebê";
        } else if (idade <= 11) {
            result = "Criança";
        } else if (idade <= 19) {
            result = "Adolescente";
        } else if (idade <= 30) {
            result = "Jovem";
        } else if (idade <= 60) {
            result = "Adulto";
        } else {
            result = "Idoso";
        }

        System.out.println(result);
    }
}
