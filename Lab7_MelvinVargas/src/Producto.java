
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

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getSegundos() {
        return segundos;
    }
    

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
