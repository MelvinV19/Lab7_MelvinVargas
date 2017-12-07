
import java.util.ArrayList;
import javax.swing.JFrame;


public class Cajero {
    String nombre;
    String idp;
    ventanaCajero frame;
    
    

    public Cajero() {
    }

    public Cajero(String nombre, String idp, ventanaCajero frame) {
        this.nombre = nombre;
        this.idp = idp;
        this.frame = frame;
    }

    public ventanaCajero getFrame() {
        return frame;
    }

    public void setFrame(ventanaCajero frame) {
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

    
    


    @Override
    public String toString() {
        return   nombre ;
    }
    
}
