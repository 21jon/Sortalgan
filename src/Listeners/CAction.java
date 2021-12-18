package Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

abstract class CAction implements ActionListener {





    public abstract void actionPerformed(ActionEvent e);


    public abstract void start() throws InterruptedException;


}
