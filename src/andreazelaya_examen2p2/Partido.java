package andreazelaya_examen2p2;

public class Partido {
    String equipo1;
    String equipo2;
    int puntos1;
    int puntos2;

    public Partido() {
    }

    public Partido(String equipo1, String equipo2, int puntos1, int puntos2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.puntos1 = puntos1;
        this.puntos2 = puntos2;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public int getPuntos1() {
        return puntos1;
    }

    public void setPuntos1(int puntos1) {
        this.puntos1 = puntos1;
    }

    public int getPuntos2() {
        return puntos2;
    }

    public void setPuntos2(int puntos2) {
        this.puntos2 = puntos2;
    }

    @Override
    public String toString() {
        return equipo1 + " v " + equipo2;
    }
    
    
}
