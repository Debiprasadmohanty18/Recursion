public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n)
    {
        if(n<2)
        {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
