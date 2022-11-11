
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57.000, false);
        System.out.println("persona1 = " + persona1);
        System.out.println("persona1 su nombre es: "+persona1.getNombre());
        
        //Modificar a través de los métodos
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre = "Juan Ignacio"; //Ya no se puede utilizar
        //System.out.println("Nombre es: "+persona1.nombre); //Error
        System.out.println("persona1 con su nombre modificado: "+persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: "+persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: "+persona1.isEliminado());
        
        //Tarea: Crear otro objeto de tipo Persona, asignar valores de manera inicial
        //y imprimir, luego modificar sus valores y volver a imprimir
        System.out.println("persona1 = " + persona1);
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona("Juan", 48000, false);
        System.out.println("Nombre persona 2 original: "+persona2.getNombre());
        System.out.println("Sueldo persona 2 original: "+persona2.getSueldo());
        System.out.println("Booleano persona 2 original: "+persona1.isEliminado());

        //ReSet de los atributos mediante el metodo setter
        persona2.setNombre("Pedro");
        persona2.setSueldo(46000);
        persona2.setEliminado(true);
        System.out.println("Nombre persona 2 modificado" +persona2.getNombre());
        System.out.println("Sueldo persona 2 modificado: "+persona2.getSueldo());
        System.out.println("Booleano persona 2 modificado: "+persona2.isEliminado());
    }
}
