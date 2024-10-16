package tanmay.Level_1_Questions;

public class CountZeroes {

	public static void main(String[] args) {
		int n = 1006;
		System.out.println(countZero(n));
	}
	
	static int countZero(int n)
	{
		return countHelp(n,0);		
	}
	
	static int countHelp(int n, int count) 
	{
		if(n == 0)
			return count;
		
		int rem = n%10;
		if(rem == 0)
			return countHelp(n/10, count+1);
		
		return countHelp(n/10, count);

	}

}
