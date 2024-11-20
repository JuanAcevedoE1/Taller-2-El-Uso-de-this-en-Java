package Taller2.THIS2;

public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante() {
        this("Desconocido", 0); 
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre; 
        this.edad = edad;     
    }

    public void mostrarEstudiante() {
        System.out.println("Nombre del estudiante: " + this.nombre);
        System.out.println("Edad del estudiante: " + this.edad);
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarEstudiante();

        Estudiante estudiante2 = new Estudiante("Elizabeth", 18);
        estudiante2.mostrarEstudiante();
    }
}