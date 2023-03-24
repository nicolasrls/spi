programa
{
	
	funcao inicio()
{
	
    real tempAleat, tempCalc
    caracter indIns
	
	escreva("Digite o valor de temperatura desejado: \n")
	leia(tempAleat)
	escreva("Para Celsius, escolha A; Para Kelvin, escolha B; Para fahrenheit escolha C;")
	leia(indIns)

    escolha(indIns){
        caso 'A':
            tempCalc = tempAleat
            escreva("A temperatura em Celsius é: ", tempCalc, "ºC")
            pare
        caso 'B':
            tempCalc = (tempAleat + 273) 
            escreva("A temperatura em Kelvin é: ", tempCalc, "K")
            pare
        caso 'C':
            tempCalc = ((tempAleat * 1.8) + 32)
            escreva("A temperatura em Fahrenheit é: ", tempCalc, "F")
            pare
        caso contrario: 
            escreva("Reveja suas escolhas amigo")
            pare
    }
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 712; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */