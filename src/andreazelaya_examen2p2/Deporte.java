package andreazelaya_examen2p2;

import java.io.Serializable;
import java.util.ArrayList;

public class Deporte implements Serializable{
    String nombre;
    ArrayList<Torneo> torneos = new ArrayList();

    public Deporte(String nombre) {
        this.nombre = nombre;
    }

    public Deporte() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
    
}
