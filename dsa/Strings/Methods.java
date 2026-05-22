package dsa.Strings;

import java.util.Arrays;

public class Methods {
    static void main() {
        String name = "Agneesh Mozumder";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(2));
//        original one did not change
        System.out.println(name);
        System.out.println(name.indexOf('g'));

        System.out.println("   Agneesh   ".strip());

        System.out.println(Arrays.toString(name.split(" ")));
    }
}
