package Utils;

import javax.swing.*;
import java.awt.*;


// Das Sortierverfahren mit eigenem Tread

abstract public class SortierverfahrenThread extends Thread {
    private final Graphics g;
    private final Rectangle bounds;
    private int[] a;
    private JTextField vertau;
    private JTextField vergleich;
    public int vergleiche = 0;
    public int vertauschungen = 0;
    private boolean interupted = false;
    public int speedv = 20;

    public SortierverfahrenThread(int[] a, Graphics g, Rectangle bounds, JTextField vertau, JTextField vergleich) {
        this.a = a;
        this.g = g;
        this.bounds = bounds;
        this.vertau = vertau;
        this.vergleich = vergleich;

    }

    public void run() {
        try {
            sortierverfahren(a);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    abstract public void sortierverfahren(int[] a) throws InterruptedException;



    protected void update(int akt, Integer lak, Integer mini) {
        vertau.setText("Vertauschungen :" + vertauschungen);
        vergleich.setText("Vergleiche :" + vergleiche);

        //Nur nen kleiner Test damit der Int nicht null ist
        int look;
        int miniIn;
        try {
            look = lak;
        } catch (NullPointerException e) {
            look = -1;
        }
        try {
            miniIn = mini;
        } catch (NullPointerException e) {
            miniIn = -1;
        }

        g.clearRect(1, 1, bounds.width - 2, bounds.height - 2);
        int c = 0;

        //Ausgabe der Rechtecke
        for (int b : a) {
            if (c <= akt-1) {
                g.setColor(Color.blue);
            } else if (c == look) {
                g.setColor(Color.red);
            }else if(c == miniIn){
             g.setColor(Color.green);
            }else {
                g.setColor(Color.lightGray);
            }
            g.fillRect(c * 6, 450, 6, -(b * 4));
            c++;
        }
    }


}
