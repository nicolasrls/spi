// var resposta = confirm("Teste de janela clique OK OU CANCELE SEU MZR!!!!!!");
//         if(resposta){
//             alert("Clicou em OK o puto");
//         }else{
//             alert("Cancelou o otário");
//         }

// function confirmacao(){
//     confirm("Pagina carregada com sucesso")
// }

function submissao(){
    confirm("Submissao realizada");
}

function bemvindo(){
    var nome = document.getElementById("nome").value;
    var senha = document.getElementById("password").value;
    if(nome == "admin" && senha == "admin"){
        confirm("Bem vindo Admin");
        submissao();
    }else{
        confirm("Login ou senha incorretos");
    }
}

// function checaBomGosto(){
//     var t = document.getElementById("drink").value;
//     if(t == 'café'){
//         alert("Parabens, mal gosto do caraio");}
//         else{
//         alert("Show");
//     }
// }

// function onOff(){
//     if(document.getElementById("texto").innerHTML == "LIGADO"){
//         document.getElementById("texto").innerHTML = "DESLIGADO";
//     }else{
//         document.getElementById("texto").innerHTML = "LIGADO";
//     }
// }

// function copiar(){
//     var x = document.getElementById("entra").value;
//     document.getElementById("copia").value = x;
// }


function hidePass() {
    const passwordInput = document.getElementById("password");
    const showPasswordButton = document.getElementById("showPassword");
    if (passwordInput.type === "password") {
        passwordInput.type = "text";
        showPasswordButton.textContent = "👁️";
    } else {
        passwordInput.type = "password";
        showPasswordButton.textContent = "👁️";
    }
}

function mudaValor(){
    var x = document.getElementById("range").value;
    var y = document.getElementById("my-range-value");
    y.textContent = x;
    
}
