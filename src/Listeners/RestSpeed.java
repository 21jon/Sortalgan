package Listeners;

import Utils.SortierverfahrenThread;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RestSpeed extends  CAction{

    JSlider speedSlider;
    SortierverfahrenThread agh;

    public RestSpeed(JSlider speedSlider, SortierverfahrenThread agh ){

        this.speedSlider = speedSlider;
        this.agh = agh;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        start();
    }

    @Override
    public void start()  {

        speedSlider.setValue(20);
        agh.speedv = 20 ;


    }
}
