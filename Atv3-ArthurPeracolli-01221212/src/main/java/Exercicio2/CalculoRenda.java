package Exercicio2;

public class CalculoRenda {
    Double rendaDividida(Double renda){
        return renda/1045;
    }

    String classeSocial(Double classe){
        String result;

        if (classe <= 2){
            result = "Classe E";
        } else if (classe <= 4) {
            result = "Classe D";
        } else if (classe <= 10) {
            result = "Classe C";
        } else if (classe <= 20) {
            result = "Classe B";
        } else {
            result = "Classe A";
        }

        return result;
    }
}
