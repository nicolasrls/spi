const pessoa = {
    nome: "Marta",
    idade: 26,
    cidade: "São Paulo"
};

for (let chave in pessoa){
    console.log(chave + ": " + pessoa[chave]);
}

