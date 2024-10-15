package tanmay.Level_1_Questions;

public class ProductOfDigits {

	public static void main(String[] args) {
		
		
		// If we put a number which have 0 at the beginning then compiler will take it as octal value, then convert it to decimal then calculate.
		int n = 0134;
		System.out.println(prodDigits(n));
		
	}
	
	static int prodDigits(int n)
	{
		if(n%10 == n)
			return n;
		return (n%10) * prodDigits(n/10);
	}

}
