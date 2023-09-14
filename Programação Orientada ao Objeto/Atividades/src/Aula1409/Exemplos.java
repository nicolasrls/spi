package Aula1409;

import java.util.Scanner;

public class Exemplos {
    public static void main(String[] args) {
        System.out.println("Digite suas notas, em sequência, e eu fornecerei a média");
        Scanner nota1 = new Scanner(System.in);
        float notaA = nota1.nextFloat();
        Scanner nota2 = new Scanner(System.in);
        float notaB = nota2.nextFloat();
        float media = ((notaA + notaB) / 2);
        if (media >= 7) {
            System.out.println("Passou com media "+media);
        }
        if(media >= 5 && media < 7){
            System.out.println("Vai pra final com media "+media);
        }
        else{
            System.out.println("Reprovou com media "+media);
        }
    }
}
