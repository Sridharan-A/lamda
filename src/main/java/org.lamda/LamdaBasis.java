package org.lamda;

import java.util.concurrent.Callable;

public class LamdaBasis {
    public static void main(String[] args) {

        MyValue m=() -> 98.6;
        double value = m.getValue();

        MyParamValue x=(double y)->y+10;
        double value1 = x.getValue(34.6);

    }
}
