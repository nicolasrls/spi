package Prova;

public class q6 {
    public static void main(String[] args){
        int leitosOcupados = 0;
        int capacidadeMaxima = 100;

        do{
            System.out.println("Paciente está em atendimento!!");
            leitosOcupados++;
        }while(leitosOcupados < capacidadeMaxima);
        System.out.println("A UPA Manaíra está lotada, capacidade maxima de " + capacidadeMaxima + " pacientes em atendimento");


    }
}
