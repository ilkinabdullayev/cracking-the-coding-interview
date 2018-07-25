/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilkinabdullayev.crackingcodinginterview;

import com.ilkinabdullayev.util.Helper;

/**
 *
 * @author ilkinabdullayev
 */
public class LeftRotation {

    public int[] rotLeft(int[] a, int d) {
        int modeRotation = d % a.length;
        if (modeRotation == 0) {
            return a;
        }

        int b[] = new int[a.length];
        for (int index = 0; index < a.length; index++) {
            int newIndex = index - modeRotation;
            if (newIndex < 0) {
                newIndex = a.length + newIndex;
            }

            b[newIndex] = a[index];
        }

        return b;
    }

    public int[] rotLeftByOne(int[] a, int d) {
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                int swp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = swp;
            }
        }

        return a;
    }

    public int[] rotLeftMethod2(int[] a, int d) {
        int b[] = new int[d];
        for (int index = 0; index < d; index++) {
            b[index] = a[index];
        }

        for (int index = 0; index < a.length; index++) {
            if (index < a.length - d) {
                a[index] = a[index + d];
            } else {
                a[index] = b[b.length - (a.length - index)];
            }
        }

        return a;
    }
    
    
    public int[] rotLeftJugglingMethod(int[] a, int d) {
        int gcdRotation = Helper.gcd(a.length, d);
        //will proceed...
        return a;
    }
}
