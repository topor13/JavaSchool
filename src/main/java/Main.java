public class Main {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        if( args.length > 0 ) {
            int n = Integer.parseInt(args[0]);
            for (int i = 1; i <= n; i++) {
                String symbol = " ";
                if(i == n) symbol = "\n";
                System.out.print(Fibonacci.fib(i) + symbol);
            }
        } else {
            MyLogger.logout("error","Need a parameter with Fibonacci count and it must be integer!");
        }

        MyLogger.logout("info","runtime in millis = " + (System.currentTimeMillis() - starttime));
    }
}
