
package test;

public class TestArreglo {
    public static void main(String[] args) { //Del lado izquierdo declaramos la variable, 
        int edades[] = new int[3]; //Del lado derecho instamciamos un Objeto de tipo Object
        System.out.println("Edades: "+edades);

        edades[0] = 17;
        System.out.println("Edades 0 = "+edades[0]);
        edades[1] = 18;
        System.out.println("Edades 1 = "+edades[1]);
        edades[2] = 19;
        System.out.println("Edades 2 = "+edades[2]);

        //edades[3] = 7;
        
        for (int i = 0; i < edades.length; i++){
            System.out.println("Edades y sus elementos "+i+": "+edades[i]);

        }
    }
}
