package dsa.recursion;

//Recursion: Function calling itself
// Why recursion? it helps us in solving bigger complex problems in a simpler way
// You can convert the recursion solutions into iterations (loops) and vice versa
// Space complexity is not constant because of recursive calls
// it helps us in breaking down bigger problems into smaller problems

public class NumberExampleTRecursion {
    static void main(String[] args) {
        print(1);
    }

    static void print(int n) {

//        Base Condition -> it is a condition where recursion will stop making new calls
//        No base condition means func. calls will keep happening, stack will be filled again, and again
//        we know every call of func. will take some memory, and time comes when memory of computer will exceed the memory
//        And this is give StackOverflow Error
        if (n == 5) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
//        recursive call
//        if you are calling a function again, and again you can treat it as a separate call in the stack
//        this is tail recursion because this is the last function call (the last thing that the function
//        is doing is calling itself not any calculation not returning
        print(n + 1);
    }
}
