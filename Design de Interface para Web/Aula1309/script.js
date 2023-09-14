
var titulo = document.querySelector("h1");
alert(titulo.textContent);
titulo.textContent = "Porsche"
console.log(titulo);


function mudaFigura(){

    var foto = document.getElementById("imagem")
    if(foto.src.match("tapete.jpg")){
        foto.src = "hmm.jpg"
    }else{
        foto.src = "tapete.jpg"
    }

}

function validaDados(){
    var numb = document.getElementById("numero").value;
    if(numb < 0){
        alert("número negativo")
    }if((numb == 0) || (numb > 0)){
        alert("zero")
    }
}

function obriga(x,y){
    if(x.value == "" || y.value == ""){
        alert("Preencha todos os campos obrigatórios.")
    }
}

function verifIdad(x){
    if(x.value < 18){
        alert("Favor voltar pro pornô quando for maior de idade!!")
    }if(x.value >= 18){
        alert("Pornô liberado")
    }
}

function calcSalario(x) {
    var texto = document.getElementById("conta");
    var valorDigitado = x.value;
    // Substituí vírgulas por pontos para garantir um formato válido de número.
    valorDigitado = valorDigitado.replace(',', '.');
    var regex = /^[0-9]+(\.[0-9]{1,2})?$/; //garante que o valor contenha apenas dígitos e um único ponto decimal.
    if (regex.test(valorDigitado)) {
        var salReceb = parseFloat(valorDigitado);
        var adicional = salReceb * 0.05;
        var descSal = (salReceb + adicional) * 0.07;
        var calc = salReceb + adicional - descSal;
        texto.textContent = "R$" + calc.toFixed(2); // Define o texto no elemento "conta" com duas casas decimais.
    } else {
        texto.textContent = "Valor inválido";
    }
}
