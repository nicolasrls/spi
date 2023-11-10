var pessoa = {
    nome: "João",
    idade: 30,
    altura: 1.75,
    peso: 80,
    ehMaiorDeIdade: true,
    temPassaporte: false,
    getPassaporte: function(){
        if(this.temPassaporte == false){
            return "não tem passaporte";
        }else{
            return "tem passaporte";
        }
    },
    setNome: function(nomin){
        if(nomin != "")this.nome = nomin;
    }
  };

pessoa.setNome(prompt());

confirm(pessoa.nome + " tem " + pessoa.idade + " anos de idade " + "e " + pessoa.getPassaporte());








