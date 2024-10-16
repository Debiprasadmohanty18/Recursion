package tanmay.Level_1_Questions;

public class ReverseANumber {

	public static void main(String[] args) {
		int n = 1078;
		System.out.println(reverseNumber(n));
	}
	
	static int sum = 0;
	static int reverseNumber(int n) {
		if(n==0)
		{
			return 0;
		}
		
		int rem = n % 10;
		
		sum = (sum * 10) + rem;
		reverseNumber(n/10);
		return sum;
	}

}
