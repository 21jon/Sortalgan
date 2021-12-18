package Listeners;

import Utils.SortierverfahrenThread;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Speedlistener implements ChangeListener {

        JSlider speedslider;
        SortierverfahrenThread agh;
    public Speedlistener(JSlider speedslider, SortierverfahrenThread agh){

        this.speedslider = speedslider;
        this.agh = agh;

    }

    @Override
    public void stateChanged(ChangeEvent e) {

       int i = speedslider.getValue();

       agh.speedv = i ;




    }
}

