programa{
    funcao inicio(){
	cadeia nproduto, pmc="n"
	caracter resposta = 's'
	inteiro vproduto = 0, vanterior = 0
	
	faca{
	escreva("Digite o nome do seu produto: \n")
	leia(nproduto)
	escreva("Digite o valor do seu produto: \n")
	leia(vproduto)
	se(vproduto > vanterior){
    	pmc = nproduto
    	vanterior = vproduto
  	}
	escreva("Você deseja registrar um novo produto novamente? 's' para Sim e 'n' para Não \n")
	leia(resposta)
	}enquanto(resposta != 'n') 
	escreva("O produto mais caro da sua lista foi : ", pmc)	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 522; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */