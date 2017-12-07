
public class Producto {
    String nombre;
    int precio;
    int segundos;

    public Producto() {
    }

    public Producto(String nombre, int precio, int segundos) {
        this.nombre = nombre;
        this.precio = precio;
        this.segundos = segundos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", segundos=" + segundos + '}';
    }
    
    
}
