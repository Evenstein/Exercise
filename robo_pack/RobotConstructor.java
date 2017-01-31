package com.evenstein.exercise.robo_pack;

import com.evenstein.exercise.robo_pack.lg_parts.LgHand;
import com.evenstein.exercise.robo_pack.lg_parts.LgHead;
import com.evenstein.exercise.robo_pack.lg_parts.LgLeg;
import com.evenstein.exercise.robo_pack.parts.Hand;
import com.evenstein.exercise.robo_pack.parts.Head;
import com.evenstein.exercise.robo_pack.parts.Leg;
import com.evenstein.exercise.robo_pack.sony_parts.SonyHand;
import com.evenstein.exercise.robo_pack.sony_parts.SonyHead;
import com.evenstein.exercise.robo_pack.sony_parts.SonyLeg;


/**
 * Created by Vitaly on 28.01.2017.
 */
public class RobotConstructor {

    public static void main(String... args) {

        Hand sonyHand = new SonyHand();
        Head sonyHead = new SonyHead();
        Leg sonyLeg = new SonyLeg();

        Hand lgHand = new LgHand();
        Head lgHead = new LgHead();
        Leg lgLeg = new LgLeg();

        Robot robotSony = new Robot(sonyHand, sonyHead, sonyLeg);
        Robot robotLg = new Robot(lgHand, lgHead, lgLeg);
        Robot robotMix = new Robot(sonyHand, lgHead, sonyLeg);

        robotSony.action();
        System.out.println("------------------");
        robotLg.action();
        System.out.println("------------------");
        robotMix.action();

    }

}
