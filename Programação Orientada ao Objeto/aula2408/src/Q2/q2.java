package Q2;

import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		int salario = 1320;
		System.out.println("Insira seu salario: ");
		Scanner entrada = new Scanner(System.in);
		float salarioForn = entrada.nextFloat();
		float conta = (salarioForn/salario);
		System.out.println("A diferenca entre os salarios eh: " + conta);	
	}
}
