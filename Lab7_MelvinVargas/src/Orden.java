
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;

public class Orden extends Thread {

    ArrayList<Producto> lista = new ArrayList();
    Cajero cajero;
    Cliente cliente;
    boolean avanzar;
    boolean vive;

    public Orden() {
    }

    public Orden(Cliente cliente, Cajero cajero) {
        this.avanzar = true;
        this.cliente = cliente;
        this.vive = true;
        this.cajero = cajero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void setVive(){
        vive=true;
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
        while (true) {
            DefaultTableModel modelo=(DefaultTableModel)cajero.getFrame().tabla.getModel();
            cajero.getFrame().jl_cajero.setText(cajero.getNombre());
            cajero.getFrame().jl_cliente.setText(cliente.getNombre());
            for (Producto producto : lista) {
                try {
                    cajero.getFrame().tf_procesando.setText(producto.nombre);
                    Thread.sleep(producto.segundos*1000);
                    Object fila[]=new Object[]{producto.nombre,cliente,producto.segundos};
                    modelo.addRow(fila);
                } catch (Exception e) {
                }
    
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Orden.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
