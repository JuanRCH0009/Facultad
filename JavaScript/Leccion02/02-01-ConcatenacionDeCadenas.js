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