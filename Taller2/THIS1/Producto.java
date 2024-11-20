package Taller2.THIS1;

public class Producto {
    
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre; 
        this.precio = precio; 
    }

    public void mostrarProducto() {
        System.out.println("Nombre del producto: " + this.nombre);
        System.out.println("Precio del producto: " + this.precio);
    }

    public static void main(String[] args) {

        Producto producto1 = new Producto("Laptop", 1500.00);
        producto1.mostrarProducto();
    }
}