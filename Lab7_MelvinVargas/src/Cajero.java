
import java.util.ArrayList;


public class Cajero {
    String nombre;
    String id;
    

    public Cajero() {
    }

    public Cajero(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Producto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Producto> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return   nombre ;
    }
    
}
