package andreazelaya_examen2p2;

import java.io.Serializable;
import java.util.ArrayList;

public class Torneo implements Serializable{
    String nombre;
    int periodo;
    ArrayList<Equipo> equipos = new ArrayList();
    ArrayList<Partido> partidos = new ArrayList();

    public Torneo(String nombre, int periodo) {
        this.nombre = nombre;
        this.periodo = periodo;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    @Override
    public String toString() {
        return nombre + equipos;
    }
    
    
}
