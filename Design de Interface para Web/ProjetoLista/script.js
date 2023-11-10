function salvarDados() {
    const nome = document.querySelector("input[name='nome']").value;
    const email = document.querySelector("input[name='email']").value;

    localStorage.setItem("nome", nome);
    localStorage.setItem("email", email);
}
document.querySelector("form").addEventListener("submit", salvarDados);

function recuperarDados() {
    const nome = localStorage.getItem("nome");
    const email = localStorage.getItem("email");

    // Exibe os dados em tela
    document.querySelector("#nome").textContent = nome;
    document.querySelector("#email").textContent = email;
}


window.addEventListener("load", function () {
    recuperarDados();
});