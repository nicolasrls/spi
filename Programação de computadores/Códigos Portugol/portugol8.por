programa{
	funcao inicio(){
	
    inteiro anoUser
    inteiro anoBase = 2023 , dif

	escreva("Insira o ano do seu nascimento: \n")
	leia(anoUser)

    dif = anoBase - anoUser

    se(dif >= 18){
    	escreva("Você é maior de idade \n")
    }senao{
    	escreva("Você é menor de idade \n")
    }
	}
} 