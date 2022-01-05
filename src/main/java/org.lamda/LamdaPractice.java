package org.lamda;

import java.util.Arrays;
import java.util.List;

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

        MyArithmeticException me=(e1,e2)->{
          int c;
          try {
              c = e1 / e2;
              System.out.println("result :"+c);
          }
          catch (ArithmeticException e){
              System.out.println("Divisor cannot be zero");
          }

        };
        me.div(6,0);


        MyIndexOutOfBuondException mi=(s1)->s1.substring(4);

        try {
            System.out.println(mi.str("abcd"));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bound");
        }


//        List<Integer> intValue= Arrays.asList(1,2,3,4,5);
//
//        for(int j=0;j<intValue.size();j++){
//            System.out.println(intValue.get(j));
//        }
//
//        for(int a:intValue){
//            System.out.println(a);
//        }
//
//        intValue.forEach(a-> System.out.println(a));

    }
}
