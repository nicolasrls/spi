var contato = {
    nome: "teste",
    telefone: "8",

    // Métodos para definir e obter o nome e o telefone
    setNome(nome) {
        if (nome !== "") {
            this.nome = nome;
        }
    },
    getNome() {
        return this.nome;
    },
    setTelefone(telefone) {
        if (telefone !== "") {
            this.telefone = telefone;
        }
    },
    getTelefone() {
        return this.telefone;
    }
};


function salvarContato(nome, telefone){
    contato.setNome(nome);
    contato.setTelefone(telefone);
    alert("Contato salvo!");
}

function mostrarContato() {
    
    const texto1 = document.createElement("span");
    texto1.textContent = "Nome: " + contato.getNome() + " ";
    const texto2 = document.createElement("span");
    texto2.textContent = "Telefone: " + contato.getTelefone();
    document.body.appendChild(texto1);
    document.body.appendChild(texto2);
}
  
function controleBTN() {
    const nomeTemp = document.getElementById("nome");
    const telTemp = document.getElementById("telefone");
    const btnEnv = document.getElementById("enviar");
    const btnMos = document.getElementById("mostrar");

    btnEnv.addEventListener("click", function () {
        salvarContato(nomeTemp.value, telTemp.value);
    });
    btnMos.addEventListener("click", mostrarContato);
}

controleBTN();