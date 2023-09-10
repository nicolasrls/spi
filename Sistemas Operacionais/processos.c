#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

void consumirCPU(){
    int c = 0;
    for (int i = 0; i < 1000; i++){
        for (int j = 0; j < 1000; j++){
            for (int k = 0; k < 1000; k++){
                c++;
            }
        }
    }
}

int main(int argc, char const *argv[])
{
    pid_t pid = getpid();
    int contador = 0;
    printf("Olá, sou o processo %d antes do fork\n", pid);

    pid = fork();
    if(pid < 0){
        perror("Erro ao criar processo\n");
        exit(1);
    }
    
    if(pid == 0){
        printf("Olá sou o processo %d, filho de %d \n", getpid(), getppid());
        for (int i = 0; i < 10; i++){
            contador++;
        }
        consumirCPU();
    } else {
        printf("Sou o processo pai id=%d\n", getpid());
        for (int i = 0; i < 100; i++){
            contador++;
        }
    }
    // waitpid(pid);
    printf("processo %d terminou com contador = %d\n", getpid(), contador);
    return 0;
}
