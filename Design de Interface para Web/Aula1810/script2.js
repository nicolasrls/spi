function saudacaoDoDia(){
    const data = new Date();
    const hora = data.getHours();
    let saudacao;
    if(hora <=12)saudacao="Bom dia";
    else if(hora >= 12 && hora < 18)saudacao="Boa tarde";
    else saudacao = "Boa noite";
    console.log(hora);
    return saudacao;
}

console.log(saudacaoDoDia());