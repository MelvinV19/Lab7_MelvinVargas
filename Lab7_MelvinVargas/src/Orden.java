
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;

public class Orden extends Thread {

    ArrayList<Producto> lista=new ArrayList();; 
    Cajero cajero;
    Cliente cliente;
    boolean avanzar;
    boolean vive;

    public Orden() {
       this.avanzar = true;
        this.cliente = cliente;
        this.vive = true;
        this.cajero = cajero;
        
    }

    public Orden(Cliente cliente, Cajero cajero) {
        this.cajero = cajero;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVive() {
        vive = true;
    }
    public void setAvanzar(){
        avanzar=true;
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
        while (vive==true) {
            if (avanzar==true) {
                DefaultTableModel modelo = (DefaultTableModel) cajero.getFrame().tabla.getModel();
                System.out.println(cajero.getNombre());
                System.out.println(cliente.getNombre());
                this.cajero.getFrame().jl_cajero.setText(cajero.getNombre());
                this.cajero.getFrame().jl_cliente.setText(cliente.getNombre());
                for (Producto producto : lista) {
                    try {
                        System.out.println(producto);
                        this.cajero.getFrame().tf_procesando.setText(producto.toString());
                        Thread.sleep(producto.getSegundos() * 1000);
                        Object fila[] = new Object[]{producto.getNombre(), cliente.getNombre(), producto.getSegundos()};
                        modelo.addRow(fila);
                        
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Orden.class.getName()).log(Level.SEVERE, null, ex);
                }
                avanzar=false;
            }
        }
    }
}
