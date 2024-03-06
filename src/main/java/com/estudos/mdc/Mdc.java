package com.estudos.mdc;

public class Mdc {

    public static int mdc(int a, int b) {
        if (b > 0 && a % b == 0) {
            return b;
        }

        if (b == 0) {
            return Math.abs(a);
        }
        return -1;
    }

}
