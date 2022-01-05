package org.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LamdaArgument {
    private String name;

    public LamdaArgument() {
    }

    public LamdaArgument(String s) {
        this.name=s;
    }

    public String getName() {
        return name;
    }

    String changeStr(StringTwoParamValue st, String a, String b) {
        return st.stringTwo(a, b);
    }

    String strOpr(StringParamValue s, String a) {
        return s.str(a);
    }

    boolean numTest(IntPredict i, int a) {
        return i.intPredict(a);
    }

    static boolean isEven(int a) {
       if(a%2==0)return true;
       return false;
    }

    boolean isPositive(int a) {
        if (a > 1) return true;
        return false;
    }


    public static void main(String[] args) {

        LamdaArgument l = new LamdaArgument();

        String s = l.changeStr((a, b) -> a.concat(b), "abc", "def");


        String s2 = l.strOpr((a) -> a.toUpperCase(), "abc");


        String s3 = l.strOpr((a) -> {
            String result = "";
            char ch;
            for (int i = 0; i < a.length(); i++) {
                ch = a.charAt(i);
                if (Character.isLowerCase(ch)) {
                    result = result + Character.toUpperCase(ch);
                } else {
                    result = result + Character.toLowerCase(ch);
                }

            }
            return result;
        }, "AbcDef");


        IntPredict i = LamdaArgument::isEven;
        boolean a1 = i.intPredict(4);

        IntPredict i2 = l::isPositive;
        boolean a2 = i2.intPredict(6);

        ConsRef cf=LamdaArgument::new;
        LamdaArgument la=cf.str("constructer reference");
        String consName=la.getName();

        Predicate<Integer> isEven=(n)->n%2==0;
        boolean pv = isEven.test(3);




    }
}
