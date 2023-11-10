package Aula1910;

public class Carro {
    boolean estadoCarro = false;
    int marchaCarro = 0;
    String corCarro;
    String modeloCarro;
    double velocidadeAtual;
    double velocidadeMaxima;

    public void setCorCarro(String corCarro) {
        this.corCarro = corCarro;
    }

    public void mudaEstadoCarro(){
        if(this.estadoCarro == false){
            estadoCarro = true;
        }else{
            estadoCarro = false;
        }
    }

    public void setMarchaCarro(int u) {
        this.marchaCarro = u;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public double getVelocidadeAtual() {
        return velocidadeAtual*3.6;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public int getMarchaCarro() {
        return marchaCarro;
    }

    public String getCorCarro() {
        return corCarro;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public String getEstadoCarro(){
        if(estadoCarro == false){
            return "O carro está desligado";
        }
        else{
            return "O carro está ligado";
        }
    }
    public void acelerarCarro(double aceleracao){
        this.velocidadeAtual += aceleracao;
    }

    public void mudarMarcha(boolean mudanca){
        int marcha = (mudanca ? 1 : -1);
        switch(marcha){
            case 1:
                if(marchaCarro < 5)marchaCarro++;
                break;
            case -1:
                if(marchaCarro > 0)marchaCarro--;
                break;
        }
    }
}
