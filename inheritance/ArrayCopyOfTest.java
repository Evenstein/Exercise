package com.evenstein.exercise.inheritance;

import java.lang.reflect.*;
import java.util.Arrays;

/**
 * Created by Vitaly on 26.01.2017.
 */
public class ArrayCopyOfTest {

    public static void main(String... args) {
        int[] a = {1, 2, 3};
        a = (int[]) goodCopyOf(a, 10);
        System.out.println(Arrays.toString(a));

        String[] b = {"Tom", "Jack", "Harry"};
        b = (String[]) goodCopyOf(b, 10);
        System.out.println(Arrays.toString(b));

        System.out.println("Next code will generate an exception");
        try {
            b = (String[]) badCopyOf(b, 10);
        } catch (Exception e) {
            //System.out.print("But it will be catched :-)");
            System.out.println(e); //e.printStackTrace();
        }

    }

    public static Object[] badCopyOf(Object[] a, int newLength) {

        Object[] newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }

    public static Object goodCopyOf(Object a, int newLength) {
        Class cl = a.getClass();
        if (!cl.isArray()) return null;
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }

}
