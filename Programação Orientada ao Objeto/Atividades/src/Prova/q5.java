package Prova;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args){
        String nomeA, nomeB;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois nomes: ");
        nomeA = sc.nextLine();
        nomeB = sc.nextLine();
        if(nomeB.compareToIgnoreCase(nomeA)>0){
            System.out.println(nomeA +" de acordo com a ordem alfabética vem primeiro e tem "+ nomeA.length()+" caracteres");
        }else if(nomeB.compareToIgnoreCase(nomeA)<0){
            System.out.println(nomeB +" de acordo com a ordem alfabética vem primeiro e tem "+ nomeB.length()+" caracteres");
        }
    }
}
