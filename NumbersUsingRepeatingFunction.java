public class NumbersUsingRepeatingFunction {
    public static void main(String[] args) {
        int n = 1;
        typeNumber1(n);
    }

    static void typeNumber1(int n)
    {
        System.out.println(n);
        typeNumber2(n + 1);
    }
    static void typeNumber2(int n)
    {
        System.out.println(n);
        typeNumber3(n + 1);
    }
    static void typeNumber3(int n)
    {
        System.out.println(n);
        typeNumber4(n + 1);
    }
    static void typeNumber4(int n)
    {
        System.out.println(n);
        typeNumber5(n + 1);
    }
    static void typeNumber5(int n)
    {
        System.out.println(n);
    }
   
}