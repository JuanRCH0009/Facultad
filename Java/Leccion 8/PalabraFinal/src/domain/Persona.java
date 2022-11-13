package domain;

public class Persona {
    public final static int CONSTANTE_AQUI = 15;
    private String nombre;
    
    public void imprimir(){
        System.out.println("metodo para imprimir");
    }

    public static int getConstanteAqui() {
        return CONSTANTE_AQUI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  

 
}
