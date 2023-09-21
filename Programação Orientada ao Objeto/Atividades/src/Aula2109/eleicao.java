package Aula2109;

import java.util.Scanner;

public class eleicao {
    public static void main(String[] args){
        int voto = 5;
        int votoSim = 0;
        int votoNao = 0;
        Scanner votin = new Scanner(System.in);
        do{
            System.out.println("Você quer ter aula na quinta as 7:30?");
            System.out.println("1 - para sim");
            System.out.println("2 - para não");
            System.out.println("0 - para encerrar a eleição");
            System.out.println("----------------------------------------------");
            voto = votin.nextInt();
            if(voto == 1){
                votoSim++;
            }else if(voto == 2){
                votoNao++;
            }
        }while(voto != 0);
        System.out.println("----------------------------------------------");
        System.out.println("Urnas encerradas!!");
        System.out.println("Tivemos "+votoSim+" votantes para ter aula");
        System.out.println("Tivemos "+votoNao+" votantes para não ter aula");
        System.out.println("--------A DEMOCRACIA QUEM FAZ É VOCÊ-----------");
    }

}
