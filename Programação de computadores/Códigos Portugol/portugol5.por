programa{
	funcao inicio(){
	
    cadeia nomeUser
    inteiro anoBase = 2023
    inteiro anoUser
    inteiro idadeUser

	escreva("Insira o seu nome: \n")
	leia(nomeUser)
	escreva("Insira o seu ano de nascimento: \n")
	leia(anoUser)  
	idadeUser = (anoBase - anoUser)
	escreva("\n Olá "+nomeUser+", a sua idade é: "+idadeUser+" anos")
	}
}
