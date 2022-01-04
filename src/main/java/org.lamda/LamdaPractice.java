package org.lamda;

public class LamdaPractice {
    public static void main(String[] args) {
        StringParamValue s = (x) -> x.toLowerCase();
        String a = s.str("ABC");


        StringValue sv = () -> "abc";
        String s2 = sv.string();


        StringTwoParamValue strTwo = (x, y) -> x.concat(y);
        String s3 = strTwo.stringTwo("java", "course");


        OddOrEven oe = (x) -> {
            if (x % 2 == 0) {
                return "even";
            } else {
                return "odd";
            }
        };
        String s4 = oe.isOddorEven(15);

        DigitCompare greaterThan=(m,n)->(m>n);
        boolean b = greaterThan.digitCompare(4, 5);

        GenericAdd<Integer> intSum=(x,y)->x+y;
        Integer resultInt = intSum.add(4, 6);

        GenericAdd<Float> floatSum=(x,y)->x+y;
        Float resultFloat=floatSum.add(2.4f,5.7f);



    }
}
