package test;

import domain.Persona;

public class TestArreglosObjects{
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];

        personas[0] = new Persona("Ariel");
        personas[1] = new Persona("Pedro");
        System.out.println("Personas 0: "+personas[0]);
        System.out.println("Personas 1: "+personas[1]);

      for (int i = 0; i < personas.length; i++) {
        System.out.println("Persona= "+i+" ="+personas[i] ); 
      }

      //Arreglos en la sintaxis resumida
      String frutas[] = {"Banana", "Pera", "Durazno"};

      for (int i = 0; i < frutas.length; i++) {
        System.out.println("Frutas  "+i+" = "+frutas[i]);
      }
    }
}