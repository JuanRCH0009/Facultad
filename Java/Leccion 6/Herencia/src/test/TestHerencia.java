package test;


import java.util.Date;
import domain.Cliente;
import domain.Empleado;

public class TestHerencia {
   public static void main(String[] args) {
    Empleado empleado1 = new Empleado("Ariel", 34000);
    System.out.println("Empleado 1: "+empleado1);
   
    Date fecha1 = new Date();

   Cliente cliente1 = new Cliente(fecha1/*Aqui se muestra la fecha en la que se genero el objeto*/, true, "Bety", 'F'/*Los datos tipo char van etre comillas simples*/, 32, "9 de Julio 1413");
       System.out.println("cliente1 = " + cliente1);
   } 

}
