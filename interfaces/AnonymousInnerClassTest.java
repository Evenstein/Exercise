package com.evenstein.exercise.interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by Vitaly on 07.02.2017.
 */
public class AnonymousInnerClassTest {

    public static void main(String... args) {

        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }

}

class TalkingClock {

    public void start(int interval, boolean beep) {

       /* ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("At the tone, the time is " + new Date());
                if (beep) Toolkit.getDefaultToolkit().beep();

            }
        };*/

        Timer t = new Timer(interval, event -> {

            System.out.println("At the tone, the time is " + new Date());
            if (beep) Toolkit.getDefaultToolkit().beep();

        });
        t.start();

    }

}
