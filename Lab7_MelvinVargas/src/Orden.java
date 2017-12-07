
import java.util.ArrayList;

public class Orden extends Thread {

    ArrayList<Producto> lista = new ArrayList();
    Cajero cajero;
    boolean avanzar;
    boolean vive;

    public Orden() {
    }

    public Orden(Cliente cliente, Cajero cajero) {
        this.avanzar = true;
        this.vive = true;
        this.cajero = cajero;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    public ArrayList<Producto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Producto> lista) {
        this.lista = lista;
    }

    @Override
    public void run() {
        while (vive) {
            for (Producto producto : lista) {
                
            }
        }
    }
}
