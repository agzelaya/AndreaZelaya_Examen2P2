package andreazelaya_examen2p2;

import javax.swing.JDialog;
import javax.swing.JProgressBar;

public class progressBar extends Thread{
    private JProgressBar barra;
    private int torneos;
    private JDialog dialog;
    private boolean kill = false;

    public progressBar(JProgressBar barra, int torneos, JDialog dialog) {
        this.barra = barra;
        this.torneos = torneos;
        this.dialog = dialog;
        barra.setMaximum(torneos*7);
    }

    public JDialog getDialog() {
        return dialog;
    }

    public void setDialog(JDialog dialog) {
        this.dialog = dialog;
    }

    public boolean isKill() {
        return kill;
    }

    public void setKill(boolean kill) {
        this.kill = kill;
    }
    
    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public int getTorneos() {
        return torneos;
    }

    public void setTorneos(int torneos) {
        this.torneos = torneos;
    }
    
    public void run(){
         while (!kill) {
            while (barra.getValue() != barra.getMaximum()) {
                barra.setValue(barra.getValue() + 1);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }

            dialog.dispose();
            
            kill=true;
            barra.setValue(0);
            setTorneos(0);
        }
        
    }
    
}
