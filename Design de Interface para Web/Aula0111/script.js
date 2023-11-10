class Animal{
    constructor(tipo){
        this.tipo = tipo;
    }
    emitirSom(){
        console.log(`O ${this.tipo} faz um som.`);
    }
}

class Gato extends Animal{
    constructor(nome){
        super('gato');
        this.nome = nome;
    }
    miar(){
        console.log(`${this.nome} está miando.`);
    }
}

const meuGato = new Gato('Creito');

meuGato.emitirSom();
meuGato.miar();


//Herança acaba aí 

$(function(){
    $("button").click(function(){
        $("#teste").hide();
    })

    $("#mouse").mouseenter(function(){
        alert("Passasse lo mause mizera");
    });

    $("input").focus(function(){
        $(this).css("background-color","#cccccc");
    });
    $("input").blur(function(){
        $(this).css("background-color","#ffffff");
    });
    $("p").on({
        // mouseenter: function(){
        //     $(this).css("background-color","lightgray");
        // },
        // mouseleave: function(){
        //     $(this).css("background-color","darkblue");
        // },
        // click: function(){
        //     $(this).css("background-color","yellow");
        // }
    });


    $("#titulo").mouseenter(function(){
        $(this).css("background-color","lightgray");
    })
    $("#titulo").click(function(){
        $("#cafe").show();
        $("#cafe").css("color","white");
        $("#cafe").css("background-color","black");
        $("#vinho").show();
        $("#vinho").css("color","white");
        $("#vinho").css("background-color","black");
    })
    $("#cafe").mouseenter(function(){
        $("#cafe").css("background-color","red")
    })
    $("#vinho").mouseenter(function(){
        $("#vinho").css("background-color","red")
    })



});


