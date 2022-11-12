/*
Uso de la palabra "Final"
Esta palabra tiene diferentes significados dependiendo 
de donde se aplique.

    Variables: Evita cambiar el valor que la variable almacena.
    Metodos: Evita que se modifique la definicion o el comportamiento.
    de un metodo desde una clase hija. 
    Clases: Evita que se creen clases hijas.

Otra caracteristica es que normalmete cuando trabajamos con variables se 
convinan con el modificador de acceso estatico para convertir una variable
en una constante, es decir, que no se puede modificar su valor. El ejemplo 
de esto es la clase Math en la cual todos sus atributos son de tipo static 
y final, es por esto que la variable π se conoce como una constante.
*/
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miDNI = 44009609;
        System.out.println("miDNI = " + miDNI);
        //miDNI = 1231244;
        //Persona.CONSTANTE_AQUI = 9;
        System.out.println("Mi atributo constante: "+Persona.CONSTANTE_AQUI);

        final Persona persona1 = new Persona();
        //persona1 = new Persona(); //No se puede asignar una nueva referencia
        persona1.setNombre("Ariel Betancud");
        System.out.println("Persona1 nombre: "+persona1.getNombre());
        persona1.setNombre("Liliana");
        System.out.println("Persona1 nombre: "+persona1.getNombre());
        
    }
 
}
