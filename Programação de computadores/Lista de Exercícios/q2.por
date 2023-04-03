programa
{
	
	funcao inicio()
	{
		real v1,v2,rOp
		caracter op

		escreva("Digite dois números: \n")
		leia(v1)
		leia(v2)
		escreva("Escolha a operação aritmetica que deseja executar: + para soma, - para subtração, * para multiplicação e / para divisão \n")
		leia(op)

		escolha(op){
			caso '+':
				rOp = v1+v2
				escreva("O resultado da soma entre ",v1," e ",v2, " é ",rOp)
				pare
			caso '-':
				rOp = v1-v2
				escreva("O resultado da subtração entre ",v1," e ",v2, " é ",rOp)
				pare
			caso '*':
				rOp = v1*v2
				escreva("O resultado da multiplicação entre ",v1," e ",v2, " é ",rOp)
				pare
			caso '/':
				se(v2!=0){
					rOp = v1/v2
					escreva("O resultado da divisão entre ",v1," e ",v2, " é ",rOp)
					pare
				}senao{
					escreva("O divisor deve ser diferente de zero!!!!")
				}
		}



		
	}
}
