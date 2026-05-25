package dsa.recursion;

public class Fibo {
    static void main() {
        System.out.println(fib(6));
    }

    static int fib(int n) {
        if (n < 2) {
            return n;
        }
//        This is not tail recursion because after getting values from both function it is adding (calculation) it
//        and also returning it
        return fib(n - 1) + fib(n - 2);
    }
}
