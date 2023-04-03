programa
{
	
	funcao inicio()
	{
		real a1,a2,area
		

		escreva("Para calcular a area, insira o valor dos lados: \n")
		leia(a1)
		leia(a2)

		area = a1*a2

		se(a1 == a2){
			escreva("A área calculada é: ", area, " e se trata de um quadrado\n")
		}senao{
			escreva("A área calculada é: ", area, " e se trata de um retangulo\n")
		}
		
	}
}
