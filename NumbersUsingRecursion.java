public class NumbersUsingRecursion {
    public static void main(String[] args) {
        int n = 1;
        typeNumber(n);
    }

    static void typeNumber(int n)
    {
        if(n == 5)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        typeNumber(n + 1);
    }

}
