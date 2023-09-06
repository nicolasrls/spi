package q1;

import java.util.Calendar;
import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        System.out.println("Insira a temperatura: ");
        Scanner entrada = new Scanner(System.in);
        float tempFornec = entrada.nextFloat();
        float conta = ((((tempFornec)*9)/5)+ 32);
        System.out.println("A temperatura em Fahrenheit eh de: " + conta + "F");
    }
}
