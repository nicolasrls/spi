package Prova;

public class q4 {
    public static void main(String[] args){
        double pesoKg = 70.5;
        double alturaMetros = 1.75;
        double imc = (int) (pesoKg / alturaMetros / alturaMetros);

        System.out.println("O IMC é: " + imc);

    }
}
