var nombre = 'Jose ';
var apellido = 'Montes';
var nombreCompleto = nombre + ' ' + apellido; //Primera concatenacion
console.log(nombreCompleto);
var nombreCompleto2 = 'Ariel'+ ' ' + 'Betancud'; //Segunda concatenacion
console.log(nombreCompleto2)
var juntos = nombre + 219; //Lee de izquierda a derecha siguiendo la cadena leyendo el numero con str
console.log(juntos);
juntos = nombre + 78 + 17 //Aqui se puede diferenciar a traves de los parentesis 
console.log(juntos)
juntos = 78 + 17 + nombre
console.log(juntos)

nombre += apellido //Concatenacion con operador simplificado
console.log(nombre)

//Hoy ya no se usa var, se usa let y const
let nombre2 = 'Pedro';
console.log(nombre2);

const apellido2 = 'Lopes';
//apellido2 = 'Perez';
console.log(apellido2)

let x, y;  //Se puden cargar varias variables un una misma linea
x = 17, y = 21;  //Se puede hacer la asigancion de varias variables dentro de la misma linea
let z = x + y; //Se asigna el valor de una operacion
console.log(z);

let $1num = 31;
let rompiendo = 'Rompe';

console.log($1num)
console.log(rompiendo)

