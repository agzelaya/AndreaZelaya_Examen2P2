package andreazelaya_examen2p2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BinariosDeportes {
    private Deporte deporte;
    private File archivo = null;

    public BinariosDeportes(String path) {
        archivo = new File(path);
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }
    
    

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void escribir(){
        FileOutputStream file = null;
        ObjectOutputStream object = null;
        try {
            file = new FileOutputStream(archivo);
            object = new ObjectOutputStream(file);
            object.writeObject(deporte);
            object.flush();
        } catch (Exception e) {
        }
        try {
            object.close();
            file.close();
        } catch (Exception e) {
        }
    }
    
    public void cargar(){
        try {
            deporte = new Deporte();
            if(archivo.exists()){
                FileInputStream file = new FileInputStream(archivo);
                ObjectInputStream object = new ObjectInputStream(file);
                try {
                    deporte = (Deporte) object.readObject();
                } catch (EOFException e) {
                }
                object.close();
                file.close();
            }
        } catch (Exception e) {
        }
    }
}
