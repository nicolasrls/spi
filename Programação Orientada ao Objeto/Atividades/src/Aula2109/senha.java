// Ganhei meio ponto na atv. Cobrar!!

package Aula2109;
import java.util.Scanner;

public class senha{
    public static void main(String[] args) {
        String senha = "";
        String senhaCerta = "naodigo";
        Scanner digit = new Scanner(System.in);
        System.out.println("Digite uma senha");
        senha = digit.nextLine();

        while(!senha.equals(senhaCerta)){
            System.out.println("Você não sabe a senha =P");
            System.out.println("Digite uma senha");
            senha = digit.nextLine();
        }
        System.out.println("Você sabe a senha =P");

    }

}



