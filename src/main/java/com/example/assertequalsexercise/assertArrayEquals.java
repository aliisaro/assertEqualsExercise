package com.example.assertequalsexercise;
public class assertArrayEquals {
    public static boolean areArraysEqual(int[] a1, int[] a2) {
        if (a1 == null || a2 == null) {
            return a1 == a2;
        }
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }
}
