package Taller2.THIS3;

public class Ejercicio3 {
    
    // Método estático que intenta usar 'this'
    public static void mostrarMensaje() {
        // Intentamos utilizar 'this' en un contexto estático
        // Esto genera un error de compilación
        // System.out.println("Mensaje desde el objeto actual: " + this); // Descomentar pa ver el error
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Llamaremos al método estático
        mostrarMensaje();
        
        // Ahora corrijo el código para no usar 'this'
        mostrarMensajeCorregido();
    }

    // Método corregido que no utiliza 'this'
    public static void mostrarMensajeCorregido() {
        System.out.println("Mensaje desde un método estático: No se necesita 'this' aquí.");
    }
}