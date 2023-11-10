package Aula1910;


public class TestaCarro {
    public static void main(String[] args){
        Carro car1 = new Carro();
        car1.setModeloCarro("Polo Sportline 2014");
        car1.setCorCarro("Branco");
        car1.setVelocidadeMaxima(210);
        System.out.println("------------Volkswagen do Brasil------------------");
        System.out.println(String.format("--Modelo do carro: %s -----",car1.getModeloCarro()));
        System.out.println(String.format("--Cor do carro: %s -----",car1.getCorCarro()));
        System.out.println(String.format("--Velocidade Máx do carro: %s -----",car1.getVelocidadeMaxima()));
        System.out.println(String.format("--Carro está ligado? %s -----",car1.getEstadoCarro()));
        System.out.println(String.format("--Marcha atual: %s -----",car1.getMarchaCarro()));
        car1.mudaEstadoCarro();
        System.out.println(String.format("--Carro está ligado? %s -----",car1.getEstadoCarro()));
        car1.mudarMarcha(true);
        System.out.println(String.format("--Marcha atual: %s -----",car1.getMarchaCarro()));
        System.out.println(String.format("--Velocidade atual: %s km/h-----",car1.getVelocidadeAtual()));
        car1.acelerarCarro(1);
        System.out.println(String.format("--Velocidade atual: %s km/h-----",car1.getVelocidadeAtual()));
        car1.acelerarCarro(3);
        System.out.println(String.format("--Velocidade atual: %s km/h-----",car1.getVelocidadeAtual()));
        car1.acelerarCarro(5);
        car1.mudarMarcha(true);
        System.out.println(String.format("--Marcha atual: %s -----",car1.getMarchaCarro()));
        System.out.println(String.format("--Velocidade atual: %s km/h-----",car1.getVelocidadeAtual()));
        car1.mudarMarcha(true);
        System.out.println(String.format("--Marcha atual: %s -----",car1.getMarchaCarro()));
    }

}
