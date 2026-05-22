package dsa.Strings;

public class Performance {
    static void main() {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch;
//            here when every time a new character is adding in the series, it is creating a new object
//            ["a", "ab", "abc".... ]
//            by the time the series is "abc....xyz". the previous series objects will not have any reference variables
//            wastage of space
//            so in this types of cases we use string builder where only one object is made and the changes will happen in that one object only and the reference is also same and it is not changed
        }
        System.out.println(series);
    }
}
