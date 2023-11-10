package Prova;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        if(numero1 > numero2){
            System.out.println("O maior número é o número 1: " + numero1);
        }else if(numero2 == numero1){
            System.out.println("Os numeros são iguais");
        }else{
            System.out.println("O maior número é o número 2: " + numero2);
        }
    }
}
