package App;

import Utils.SortierverfahrenThread;

import javax.swing.*;
import java.awt.*;

public class Selectionsort extends SortierverfahrenThread {
    public Selectionsort(int[] a, Graphics g, Rectangle bounds, JTextField vertau, JTextField vergleich) {
        super(a, g, bounds, vertau, vergleich);
    }

    @Override
    public void sortierverfahren(int[] a) throws InterruptedException {
        for (int unsortiert = 0; unsortiert < a.length; unsortiert += 1) {
            int minimumIndex = unsortiert;
            for (int aktuell = unsortiert + 1; aktuell < a.length; aktuell += 1) {
                update(unsortiert, aktuell, minimumIndex );
                vergleiche++;

                sleep(speedv);
                if (a[aktuell] < a[minimumIndex]) {
                    minimumIndex = aktuell;
                    update(unsortiert, aktuell, minimumIndex);

                }
            }
            vertauschungen++;
            int temp = a[unsortiert];
            a[unsortiert] = a[minimumIndex];
            a[minimumIndex] = temp;

            //Ist null da aktuell nicht mehr existiert
            update(unsortiert, null, null);
        }
    }
}
