#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(int argc, char *argv[]) {
    if (argc != 2) {
        fprintf(stderr, "Uso: %s <numero_de_processos>\n", argv[0]);
        exit(1);
    }

    int n = atoi(argv[1]);

    for (int i = 0; i < n; i++) {
        int pid = fork();

        if (pid < 0) {
            perror("Erro ao criar processo");
            exit(1);
        } else if (pid == 0) {
            // Este é o processo filho
            printf("Processo filho %d com PID %d\n", i + 1, getpid());

            // Use a função exec para executar o programa "subrotina"
            execl("./subrotina", "subrotina", NULL);

            // Se a execução chegar aqui, houve um erro
            perror("Erro ao executar subrotina");
            exit(1);
        } else {
            // Este é o processo pai, continue criando mais processos
        }
    }

    // O processo pai aguarda todos os filhos terminarem
    for (int i = 0; i < n; i++) {
        wait(NULL);
    }

    printf("Todos os processos filhos terminaram.\n");

    return 0;
}
