function calcMedia(){
    var meedia = document.getElementById("media");
    var sittuacao = document.getElementById("situacao");
    var nota1 = document.getElementById("nota_1").value;
    var nota2 = document.getElementById("nota_2").value;
    var nota3 = document.getElementById("nota_3").value;
    nota1 = nota1.replace(',', '.');
    nota2 = nota2.replace(',', '.');
    nota3 = nota3.replace(',', '.');
    nota1 = parseFloat(nota1);
    nota2 = parseFloat(nota2);
    nota3 = parseFloat(nota3);
    var media = ((nota1 + nota2 + nota3)/3);

    meedia.textContent = media.toFixed(2);
    
    if(media >= 7){
        sittuacao.textContent = "Aprovado";
    }else if(media < 7 && media> 5){
        sittuacao.textContent = "Final";
    }else{
        sittuacao.textContent = "Reprovado";
    }
}
