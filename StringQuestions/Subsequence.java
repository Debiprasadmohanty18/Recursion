package tanmay.StringQuestions;

public class Subsequence {

	public static void main(String[] args) {
		String s = "asd";
		String p = "";
		subset(p, s);
	}
	
	static void subset(String p,String s)
	{
		if(s.isEmpty())
		{
			System.out.println(p);
			return;
		}
		
		char ch = s.charAt(0);
		
		subset(p+ch, s.substring(1));
		subset(p, s.substring(1));		
	}

}
