package com.evenstein.exercise.interfaces;

import java.lang.reflect.*;
import java.util.*;

/**
 * Created by Vitaly on 08.02.2017.
 */
public class ProxyTest {

    public static void main(String... args) {

        Object[] elements = new Object[1000];

        for (int i = 0; i < elements.length; i++) {

            Integer value = i + 1;
            InvocationHandler handler = new TraceHandler(value);
            Object proxy = Proxy.newProxyInstance(null, new Class[] {Comparable.class}, handler);
            elements[i] = proxy;

        }

        Integer key = new Random().nextInt() + 1;
        int result = Arrays.binarySearch(elements, key);
        if (result >= 0) System.out.println(elements[result]);

    }

}

class TraceHandler implements InvocationHandler {

    private Object target;

    public TraceHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.print(target);
        System.out.print("." + method.getName() + "(");
        if (args != null) {

            for (int i = 0; i < args.length; i++) {

                System.out.println(args[i]);
                if (i < args.length - 1) System.out.println(", ");

            }

        }
        System.out.println(")");
        return method.invoke(target, args);

    }
}
