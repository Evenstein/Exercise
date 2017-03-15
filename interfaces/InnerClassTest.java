package com.evenstein.exercise.interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by Vitaly on 06.02.2017.
 */
public class InnerClassTest {


    public static void main(String... args) {

        TalkingClock clock = new InnerClassTest().new TalkingClock(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }

    class TalkingClock {

        private int interval;
        private boolean beep;

        public TalkingClock(int interval, boolean beep) {

            this.interval = interval;
            this.beep = beep;

        }

        public void start() {

            ActionListener listener = this.new TimePrinter();
            Timer t = new Timer(interval, listener);
            t.start();

        }


        public class TimePrinter implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {

                Date now = new Date();
                System.out.println("At the tone, the time is " + now);
                if (beep) Toolkit.getDefaultToolkit().beep();

            }

        }
    }

}
