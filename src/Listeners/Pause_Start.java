package Listeners;

import Utils.SortierverfahrenThread;

import java.awt.event.ActionEvent;

public class Pause_Start extends CAction {

    Boolean paused = false;
    SortierverfahrenThread agh;
    public Pause_Start(SortierverfahrenThread agh){

    this.agh = agh;


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            start();

        }catch (InterruptedException e1){

            e1.printStackTrace();

        }

    }

    @Override
        public void start() throws InterruptedException {





                   if(!paused){

                   agh.suspend();
                   paused = !paused;


               }else {



                           agh.resume();
                           paused = !paused;




                   }




       }



        }

