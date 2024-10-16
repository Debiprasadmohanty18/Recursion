package tanmay.Level_1_Questions;

public class Way2ReverseANumber {

	public static void main(String[] args) 
	{
		int n = 9876;
		System.out.println(reverseNo(n));
	}
	
	static int sum = 0;
	static int reverseNo(int n)
	{
		int digits = (int) (Math.log10(n)) + 1;
//		return digits;
		return revHelper(n,digits);		
	}
	
	static int revHelper(int n, int digits) {
		if(n == 0)
		{
			return 0;
		}
		int rem = n % 10;
		return rem * (int) (Math.pow(10, digits-1)) + revHelper(n/10, digits-1);
	}

}
