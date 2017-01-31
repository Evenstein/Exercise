package com.evenstein.exercise.robo_pack;

import com.evenstein.exercise.robo_pack.parts.Hand;
import com.evenstein.exercise.robo_pack.parts.Head;
import com.evenstein.exercise.robo_pack.parts.Leg;

/**
 * Created by Vitaly on 28.01.2017.
 */
public class Robot {

    private Hand hand;
    private Head head;
    private Leg leg;

    Robot() {
        System.out.println("You need parts (Hand, Head, Leg) to make a Robot");
    }

    Robot(Hand hand, Head head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public void action() {
        hand.move();
        head.sayHello();
        leg.goTo();
    }

}
