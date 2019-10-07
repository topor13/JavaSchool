public class Fibonacci {
    public static int fib(int index) {
        if (index == 1) return 1;
        if (index == 2) return 1;
        return fib(index - 1) + fib(index - 2);
    }
}
