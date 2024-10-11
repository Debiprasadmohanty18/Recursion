package tanmay.Level_1_Questions;

public class PrintNumber {

	public static void main(String[] args) {
		printStart(5);
		printRev(5);
		printBoth(5);
	}
	
	public static void printStart(int n)
	{
		if(n==0)
			return;
		printStart(n-1);
		System.out.println(n);
	}
	
	// Reverse Printing
	public static void printRev(int n)
	{
		if(n==0)
		{
			return;
		}
		printRev(n-1);
		System.out.println(n);
	}
	
	// Both Printing
	public static void printBoth(int n)
	{
		if(n==0)
			return;
		System.out.println(n);
		printBoth(n-1);
		System.out.println(n);
	}
}
