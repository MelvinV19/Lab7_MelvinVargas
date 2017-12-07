
import java.util.ArrayList;
import javax.swing.JFrame;


public class Cajero {
    String nombre;
    String idp;
    JFrame frame;
    
    

    public Cajero() {
    }

    public Cajero(String nombre, String id, JFrame frame) {
        this.nombre = nombre;
        this.idp = id;
        this.frame = frame;
        
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdp() {
        return idp;
    }

    public void setId(String id) {
        this.idp = id;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
    


    @Override
    public String toString() {
        return   nombre ;
    }
    
}
