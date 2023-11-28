
window.addEventListener('load', carregarTarefas());

function mostrarPopup() {
    var popup = document.getElementById("popup");
    popup.style.display = "block";
}

function fecharPopup() {
    var popup = document.getElementById("popup");
    popup.style.display = "none";
}

function limparTarefas() {
    // Limpar todo o conteúdo do localStorage
    localStorage.clear();
    // Reiniciar o contadorTarefas
    localStorage.setItem('contadorTarefas', '0');
    // Limpar o conteúdo da divTarefas
    var divTarefas = document.getElementById("divTarefas");
    divTarefas.innerHTML = '';
}


function criarElementoTarefa(tarefa) {
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
        executarAcao(tarefa.concluida ? "Marcar como concluída" : "Desmarcar como concluída", span, tarefa);
    });

    var optionRemover = document.createElement("a");
    optionRemover.classList.add("dropdown-item");
    optionRemover.href = "#";
    optionRemover.textContent = "Remover tarefa";
    optionRemover.addEventListener("click", function () {
        executarAcao("Remover tarefa", span, tarefa);
    });

    dropdownMenu.appendChild(optionToggleConcluir);
    dropdownMenu.appendChild(optionRemover);

    dropdown.appendChild(dropdownButton);
    dropdown.appendChild(dropdownMenu);

    var span = document.createElement("span");
    span.textContent = tarefa.numero + ". " + tarefa.texto;

    var paragrafo = document.createElement("p");
    paragrafo.appendChild(span);
    paragrafo.appendChild(dropdown);
    var divTarefas = document.getElementById("divTarefas");
    divTarefas.appendChild(paragrafo);

    return divTarefas;
}


function adicionarTarefa() {
    var tarefaInput = document.getElementById("tarefaInput").value;
    if (tarefaInput.trim() !== "") {
        // Chame a função addTarefa com o texto inserido como parâmetro
        addTarefa(tarefaInput);
        fecharPopup();
    }
}


function addTarefa(textoInserido) {
    var contadorTarefas = parseInt(localStorage.getItem('contadorTarefas')) || 1;
    var tarefa = {
        numero: 0,
        texto: textoInserido,
        concluida: false // Inicialmente, a tarefa não está concluída
    };
    var span = document.createElement("span");
    tarefa.numero += contadorTarefas;
    span.textContent = tarefa.numero + ". " + tarefa.texto; // conteúdo da tarefa eh esse numero inicial + o texto dela
    contadorTarefas++; // Incrementa o contador de tarefas
    localStorage.setItem('contadorTarefas', contadorTarefas);
    criarElementoTarefa(tarefa);
    localStorage.setItem('tarefa_' + tarefa.numero, JSON.stringify(tarefa));
}


function executarAcao(acao, span, tarefa) {
    if (acao === "Marcar como concluída" || acao === "Desmarcar como concluída") {
        // Verifica se o texto do botão é "Marcar como concluída"
        if (acao === "Marcar como concluída") {
            span.style.textDecoration = "line-through";
            tarefa.concluida = true;
        } else {
            // Caso contrário, assume que o texto do botão é "Desmarcar como concluída"
            span.style.textDecoration = "none";
            tarefa.concluida = false;
        }
        // Atualiza o estado da tarefa no localStorage
        localStorage.setItem('tarefa_' + tarefa.numero, JSON.stringify(tarefa));
    } else if (acao === "Remover tarefa") {
        span.parentElement.remove();
        // Obtém o número da tarefa a partir do texto do span
        var numeroTarefa = parseInt(span.textContent.split(".")[0]);
        // Remove a tarefa do localStorage
        localStorage.removeItem('tarefa_' + numeroTarefa);
        // Remove o parágrafo (que contém a tarefa) do DOM
        paragrafo.remove();
        // Decrementa o contadorTarefas
        var contadorTarefas = parseInt(localStorage.getItem('contadorTarefas')) || 0;
        contadorTarefas--;
        // Atualiza o localStorage com o novo valor do contadorTarefas
        localStorage.setItem('contadorTarefas', contadorTarefas.toString());
    }
}

// Função para carregar tarefas do localStorage
function carregarTarefas() {
    var divTarefas = document.getElementById("divTarefas");

    // Limpar o conteúdo da div para evitar duplicatas
    divTarefas.innerHTML = '';

    var elementosTarefa = []; // Array para armazenar os elementos da tarefa

    // Iterar sobre as chaves do localStorage e recuperar tarefas
    for (var i = 0; i < localStorage.length; i++) {
        var key = localStorage.key(i);

        // Verificar se a chave representa uma tarefa
        if (key.startsWith('tarefa_')) {
            var tarefa = JSON.parse(localStorage.getItem(key));

            // Criar elemento HTML para exibir a tarefa
            var elementoTarefa = criarElementoTarefa(tarefa);

            // Aplicar estilo de "line-through" se a tarefa estiver concluída
            if (tarefa.concluida) {
                var span = elementoTarefa.querySelector("span");
                span.style.textDecoration = "line-through";
            }

            // Adicionar o elemento à array
            elementosTarefa.push(elementoTarefa);
        }
    }

    // Ordenar a array com base no número da tarefa
    elementosTarefa.sort(function (a, b) {
        var numeroA = parseInt(a.querySelector("span").textContent.split(".")[0]);
        var numeroB = parseInt(b.querySelector("span").textContent.split(".")[0]);
        return numeroA - numeroB;
    });

    // Adicionar todos os elementos da tarefa à divTarefas
    elementosTarefa.forEach(function (elemento) {
        divTarefas.appendChild(elemento);
    });
}

