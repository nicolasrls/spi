const pessoa = {nome: "Nícolas",idade: 21};
const strJSON = JSON.stringify(pessoa); // converte objeto JS para JSON
console.log(strJSON);
const objetoJS = JSON.parse(strJSON); // converte objeto JSON para JS
console.log(objetoJS);

const jsonString = '{"nome": "Bob","idade":30}';
console.log(jsonString);
const objJs = JSON.parse(jsonString);
console.log(objJs);

localStorage.setItem("salv1",strJSON);
const strRecup = localStorage.getItem("salv1");
const test = JSON.parse(strRecup);
console.log(test);