package tanmay.StringQuestions;

public class SkipACharacter2 {

	public static void main(String[] args) 
	{
		String s = "abcacabcddhdka";
		String p = "";		
		System.out.println(skipChar(s,p));
	}
	
	static String skipChar(String s, String p)
	{
		if(s.isEmpty())
		{
			return p;
		}
		
		char ch = s.charAt(0);
		
		if(ch == 'a')
		{
			return skipChar(s.substring(1), p);
		}
		else 
		{
			return skipChar(s.substring(1), p + ch);
		}
	}

}
