package q2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int salario = 1320;
        System.out.println("Insira seu salario: ");
        Scanner entrada = new Scanner(System.in);
        float salarioForn = entrada.nextFloat();
        float conta = (salarioForn/salario);

        //!!!!!método para converter float em string com casas decimais setadas!!!!!

        String formato = "%.2f";
        String contaForm = String.format(formato, conta);
        System.out.println("A diferenca entre os salarios eh: " + contaForm);
    }
}