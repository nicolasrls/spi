package Aula1409;

import java.util.Scanner;
public class produtos {
    public static void main(String[] args) {
        int cod,quant;
        float conta = 0;
        String formato = "%.2f";
        String contaForm = String.format(formato, conta);
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        System.out.println("Insira o código do produto");
        cod = entrada.nextInt();
        System.out.println("Insira a quantidade do produto");
        quant = entrada2.nextInt();

        switch(cod){
            case 0:
                conta = (9.5f*quant);
                System.out.println("Você escolheu Cachorro quente\nTotal:R$"+conta);
                break;
            case 1:
                conta = (5.32f*quant);
                System.out.println("Você escolheu Coxinha\nTotal:R$"+conta);
                break;
            default:
                System.out.println("Código inexistente");
                break;
        }
    }
}
