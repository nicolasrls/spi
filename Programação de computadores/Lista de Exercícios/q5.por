programa
{
	funcao inicio()
	{
		inteiro balde=0,numUser1,numUser2,numUser3,numUser4,numUser5,numUser6,numUser7,numUser8,numUser9,numUser10,numUser11,numUser12,numUser13,numUser14,numUser15,contador=0
		
		escreva("Digite 15 valores")
		leia(numUser1)
		leia(numUser2)
		leia(numUser3)
		leia(numUser4)
		leia(numUser5)
		leia(numUser6)
		leia(numUser7)
		leia(numUser8)
		leia(numUser9)
		leia(numUser10)
		leia(numUser11)
		leia(numUser12)
		leia(numUser13)
		leia(numUser14)
		leia(numUser15)
		
		enquanto(contador<15){
			se(balde < numUser1){
				balde = numUser1
			}
			se(balde < numUser2){
				balde = numUser2
			}
			se(balde < numUser3){
				balde = numUser3
			}
			se(balde < numUser4){
				balde = numUser4
			}
			se(balde < numUser5){
				balde = numUser5
			}
			se(balde < numUser6){
				balde = numUser6
			}
			se(balde < numUser7){
				balde = numUser7
			}
			se(balde < numUser8){
				balde = numUser8
			}
			se(balde < numUser9){
				balde = numUser9
			}
			se(balde < numUser10){
				balde = numUser10
			}
			se(balde < numUser11){
				balde = numUser11
			}
			se(balde < numUser12){
				balde = numUser12
			}
			se(balde < numUser13){
				balde = numUser13
			}
			se(balde < numUser14){
				balde = numUser14
			}
			se(balde < numUser15){
				balde = numUser15
			}
			contador++
		}
		escreva("O maior numero foi: ", balde)
	}
}
