package dsa.linearsearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Agneesh";
        char target = 'n';
        int ans = search(name, target);

        System.out.println("Element is found at index " + ans);

    }
    static int search(String name, char target) {
        if (name.length() == 0) {
            return -1;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return i;
            } 
        }

        // for (int element : name) {
        //     if (element == target) {
        //         return element;
        //     }
        // }
        return -1;
    }
}
