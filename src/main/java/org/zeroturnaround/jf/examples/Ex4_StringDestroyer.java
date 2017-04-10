package org.zeroturnaround.jf.examples;

import java.lang.reflect.Field;

public class Ex4_StringDestroyer {

    public static void main(String[] args) throws Exception {
        Field value = Integer.class.getDeclaredField("value");
        value.setAccessible(true);
        value.set(42, 47);
        System.out.printf("Six times seven = %d%n", 6 * 7);
    }


}
