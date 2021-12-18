

import Listeners.AnimationStart;

import javax.swing.*;
import java.awt.*;


public class SortierenFenster extends JFrame {

    private JPanel pZeichenflaeche;
    private JPanel pMain;
    private JButton bAnimate;
    private JTextField jTextFieldVertauschungen;
    private JTextField jTextFieldVergleiche;
    private JButton pauseResumeButton;
    private JButton stopButton;
    private JSlider Speedslider;
    private JButton restSpeedButton;
    private JList list1;


    SortierenFenster() throws HeadlessException {

        pZeichenflaeche.setPreferredSize(new Dimension(640, 480));
        pMain.setPreferredSize(new Dimension(700, 700));
        add(pMain);
        pack();
        setTitle("Selection-Sort");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        jTextFieldVergleiche.setText("Vergleiche :");
        jTextFieldVertauschungen.setText("Vertauschungen :");


        //Custom Action listener
        bAnimate.addActionListener(new AnimationStart(
                pZeichenflaeche.getGraphics(),
                pZeichenflaeche.getBounds(),
                jTextFieldVertauschungen,
                jTextFieldVergleiche,
                pauseResumeButton,
                stopButton,
                Speedslider,
                restSpeedButton
                ));



    }



    public static void main(String[] args) {

        new SortierenFenster();
    }





}
