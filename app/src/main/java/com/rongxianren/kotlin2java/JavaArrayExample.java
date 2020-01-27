package com.rongxianren.kotlin2java;

import com.rongxianren.innerclass.NestedAndInnerClassKt;

public class JavaArrayExample {
    public void removeIndices(int[] indices) {
        // 在此编码……
        for (int value : indices) {
            System.out.println("value - " + value);
        }
    }

    public int getId(KotlinOpJava kotlinOpJava) {
        return kotlinOpJava.id;
    }
}
