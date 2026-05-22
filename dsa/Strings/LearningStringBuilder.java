package dsa.Strings;

public class LearningStringBuilder {
    static void main() {
//        this is mutable
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            sb.append(ch);
        }
        System.out.println(sb.toString());

//        System.out.println(sb.deleteCharAt(0));
//        System.out.println(sb.indexOf("c"));
        System.out.println(sb.reverse());
    }
}
