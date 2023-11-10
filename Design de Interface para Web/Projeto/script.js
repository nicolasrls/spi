// Carrega as tarefas do localStorage no início
var tarefasSalvas = recuperaTarefas();


// Itera sobre as tarefas recuperadas e chama addTarefa para exibi-las
for (var i = 0; i < tarefasSalvas.length; i++) {
    addTarefa(tarefasSalvas[i].texto);
}

function mostrarPopup() {
    var popup = document.getElementById("popup");
    popup.style.display = "block";
}

function fecharPopup() {
    var popup = document.getElementById("popup");
    popup.style.display = "none";
}

function tarefaJaExiste(tarefas, textoTarefa) {
    for (var i = 0; i < tarefas.length; i++) {
        if (tarefas[i].texto === textoTarefa) {
            return true; // Já existe uma tarefa com o mesmo texto
        }
    }
    return false; // Não há tarefa duplicada
}

function adicionarTarefa() {
    var tarefaInput = document.getElementById("tarefaInput").value;
    if (tarefaInput.trim() !== "") {
        // Chame a função addTarefa com o texto inserido como parâmetro
        addTarefa(tarefaInput);
        fecharPopup();
    } else {
        alert("Favor preencher o campo da tarefa!");
    }
}



function recuperaTarefas() {
    var tarefasSalvas = JSON.parse(localStorage.getItem('tarefas'));
    return tarefasSalvas || []; // Retorna um array vazio se não houver tarefas salvas
}

var contadorTarefas = 1;

function addTarefa(textoInserido) {
    var tarefas = recuperaTarefas(); // Recupera as tarefas do localStorage
    var tarefa = {
        texto: textoInserido,
        concluida: false
    };

    tarefas.push(tarefa); // Adiciona a nova tarefa à lista
    salvaTarefas(tarefas); // Salva as tarefas no localStorage
    var numeroTarefa = tarefas.length;

    var span = document.createElement("span");
    span.textContent = contadorTarefas + ". " + tarefa.texto;
    contadorTarefas++; // Incrementa o contador de tarefas

    var dropdown = document.createElement("div");
    dropdown.classList.add("dropdown");

    var dropdownButton = document.createElement("button");
    dropdownButton.classList.add("btn", "btn-secondary", "dropdown-toggle");
    dropdownButton.type = "button";
    dropdownButton.id = "dropdownMenuButton";
    dropdownButton.setAttribute("data-bs-toggle", "dropdown");
    dropdownButton.setAttribute("aria-haspopup", "true");
    dropdownButton.setAttribute("aria-expanded", "false");
    dropdownButton.textContent = "Selecione a ação";

    var dropdownMenu = document.createElement("div");
    dropdownMenu.classList.add("dropdown-menu");
    dropdownMenu.setAttribute("aria-labelledby", "dropdownMenuButton");

    var optionToggleConcluir = document.createElement("a");
    optionToggleConcluir.classList.add("dropdown-item");
    optionToggleConcluir.href = "#";
    optionToggleConcluir.textContent = tarefa.concluida ? "Desmarcar como concluída" : "Marcar como concluída";
    optionToggleConcluir.addEventListener("click", function () {
        tarefa.concluida = !tarefa.concluida;
        optionToggleConcluir.textContent = tarefa.concluida ? "Desmarcar como concluída" : "Marcar como concluída";
        executarAcao(tarefa.concluida ? "Marcar como concluída" : "Desmarcar como concluída", span);
    });

    var optionRemover = document.createElement("a");
    optionRemover.classList.add("dropdown-item");
    optionRemover.href = "#";
    optionRemover.textContent = "Remover tarefa";
    optionRemover.addEventListener("click", function () {
        executarAcao("Remover tarefa", span);
    });

    dropdownMenu.appendChild(optionToggleConcluir);
    dropdownMenu.appendChild(optionRemover);

    dropdown.appendChild(dropdownButton);
    dropdown.appendChild(dropdownMenu);

    var paragrafo = document.createElement("p");

    paragrafo.appendChild(span);
    paragrafo.appendChild(dropdown);

    var divTarefas = document.getElementById("divTarefas");
    divTarefas.appendChild(paragrafo);
}

function salvaTarefas(tarefas) {
    localStorage.setItem('tarefas', JSON.stringify(tarefas));
}

function executarAcao(acao, span) {
    if (acao === "Marcar como concluída" || acao === "Desmarcar como concluída") {
        // Verifica se o texto do botão é "Marcar como concluída"
        if (acao === "Marcar como concluída") {
            span.style.textDecoration = "line-through";
        } else {
            // Caso contrário, assume que o texto do botão é "Desmarcar como concluída"
            span.style.textDecoration = "none";
        }
    } else if (acao === "Remover tarefa") {
        span.parentElement.remove();
    }
}

function limparTarefas() {
    var divTarefas = document.getElementById("divTarefas");
    divTarefas.innerHTML = ''; // Remove todos os elementos filhos da div
    // Limpa as tarefas no localStorage
    localStorage.removeItem('tarefas');
}
