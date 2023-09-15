import sys
import os

if len(sys.argv) != 2:
    print(f"Uso: {sys.argv[0]} <numero_de_processos>")
    sys.exit(1)


n = int(sys.argv[1])

for i in range(n):
    pid = os.fork()

    if pid < 0:
        print ("Erro ao criar processo")
        sys.exit(1)

    elif pid == 0:
        #processo filho
        print(f"processo filho {os.getpid()} criado.")

        #chamada exec p executar subroina.py
        os.execlp("python", "python", "subrotina.py")

        #Se o exec falhar, exibe erro e  sai
        print("Erro ao executar subrotina")
        sys.exit(1)

    #Aguardar processos filhos terminarem
    for i in range(n):
        os.wait()