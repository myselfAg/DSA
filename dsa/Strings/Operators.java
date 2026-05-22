package dsa.Strings;

import java.util.ArrayList;

public class Operators {
    static void main() {
//        Add the ASCII values
        System.out.println('a' + 'b');
//        Concatenate the strings
        System.out.println("a" + "b");
//        ASCII value of a + 3
        System.out.println('a' + 3);
//        The final value will be converted into char
        System.out.println((char) ('a' + 3));

//        int will be converted into Integer that will call toString()
//        after some few steps this is same as: "a" + "1"
        System.out.println("a" + 1);
        System.out.println("Agneesh" + new ArrayList<>());
        System.out.println("Agneesh" + new Integer(21));

//        The operator + is only defined for primitives or any one of them is a String
//        We can use complex objects but at least one object should be of type string
//        The line below will give error
//        System.out.println(new Integer(21) + new ArrayList<>());
        String ans = new Integer(21) + " " + new ArrayList<>();
        System.out.println(ans);
    }
}
