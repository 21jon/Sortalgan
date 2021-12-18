package Listeners;

import Utils.SortierverfahrenThread;

import java.awt.event.ActionEvent;

public class Stop extends CAction {

    SortierverfahrenThread agh;

    public Stop(SortierverfahrenThread agh){
        this.agh = agh;


    }

    @Override
    public void actionPerformed(ActionEvent e) {

       start();

    }

    @Override
    public void start()  {

        agh.stop();

    }
}
