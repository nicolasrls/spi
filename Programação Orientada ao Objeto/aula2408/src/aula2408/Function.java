package aula2408;
import java.util.Scanner;
import java.util.Calendar;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite seu nome: ");
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		System.out.println("Digite o ano do seu nascimento: ");
		Scanner entrada2 = new Scanner(System.in);
		int anoNasc = entrada2.nextInt();
		Calendar ci = Calendar.getInstance();
		int ano = (ci.get(Calendar.YEAR));
		System.out.println("Digite a sua matrícula: ");
		Scanner entrada3 = new Scanner(System.in);
		Long matric = entrada3.nextLong();
		System.out.println("O nome eh: " + nome);
		System.out.println("Sua idade eh: " + (ano-anoNasc) ) ;
		System.out.println("Sua matricula eh: " + matric ) ;
	}
}
