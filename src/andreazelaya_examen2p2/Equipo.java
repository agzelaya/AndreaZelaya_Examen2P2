package andreazelaya_examen2p2;

public class Equipo {
    String nombre;
    int puntos;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
