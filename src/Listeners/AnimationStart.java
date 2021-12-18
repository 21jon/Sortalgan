package Listeners;


import App.Selectionsort;
import Utils.ArrayR;
import Utils.SortierverfahrenThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AnimationStart extends CAction{

    private final Graphics g;
    private final Rectangle bounds;
    private final JTextField vertau;
    private final JTextField vergleich;
    private SortierverfahrenThread agh;
    private JButton Stop;
    private JButton pr;
    private JSlider Speedslider;
    private JButton restSpeedButton;



    public AnimationStart(Graphics g, Rectangle bounds, JTextField vertau, JTextField vergleich, JButton Pause_Resume, JButton Stop, JSlider Speedslider, JButton restSpeedButton){



            this.g = g;
            this.bounds = bounds;
            this.vertau = vertau;
            this.vergleich = vergleich;
            this.pr = Pause_Resume;
            this.Stop = Stop;
            this.Speedslider = Speedslider;
            this.restSpeedButton = restSpeedButton;



    }


    @Override
    public void actionPerformed(ActionEvent e) {

        start();

    }

    @Override
    public void start()  {

        if (agh == null) {
            agh = new Selectionsort(ArrayR.zufallsArray(100), g, bounds, vertau, vergleich);

            agh.start();
        }

        else if (!agh.isAlive()){
            agh = new Selectionsort(ArrayR.zufallsArray(100), g, bounds, vertau, vergleich);
            agh.start();


        }else{

            System.out.println("Sortieren Läuft noch");

        }

        pr.addActionListener(new Pause_Start( agh));
        Stop.addActionListener(new Stop( agh));
        Speedslider.addChangeListener(new Speedlistener(Speedslider, agh));
        restSpeedButton.addActionListener(new RestSpeed(Speedslider,agh));


    }
}
