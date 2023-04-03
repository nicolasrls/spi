programa{
	inclua biblioteca Matematica --> mat
    	funcao inicio(){
    	
     inteiro a,mult=0,i=0
     real raiz
     caracter op
	escreva("Digite um numero de 1 a 10\n")
	leia(a)
	escreva("Escolha a operação desejada: * para tabuada, & para potenciação, # para radiciação\n")
	leia(op)
	
	escolha(op){
		caso '*':
			faca{
				mult=(a*i)
				escreva(a,"*",i,"=",mult,"\n")
				i++
			}enquanto(i<=10)
		pare
		caso '&':
			escreva(a,"² = ",(a*a))
		pare
		caso '#':
			raiz = mat.raiz(a,2.0)
			escreva("A raiz quadrada de ",a," é: ",mat.arredondar(raiz,3)+"\n")
		pare
		
	}
       
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 577; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */