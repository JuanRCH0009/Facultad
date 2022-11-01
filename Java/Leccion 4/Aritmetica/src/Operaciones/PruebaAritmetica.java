
package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
    var a = 10; //Variables locales
    int b = 7;
    miMetodo(); //LLamamos al nuevo metodo
    Aritmetica aritmetica1 = new Aritmetica();  // Se llama al constructor, es decir, se reserva un espacio en la memoria
    aritmetica1.a = 3;
    aritmetica1.b = 7;
    aritmetica1.sumarNumeros();
    
    int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
    
    resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos: "+resultado);
        
        System.out.println("aritmetica1 a: "+aritmetica1.a);
        System.out.println("aritmetica1 b: "+aritmetica1.b);
        
        var aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
    }
    
    public static void miMetodo(){
        //int a = 10;
        System.out.println("Aqui hay otro metodo");
    }
   
}
