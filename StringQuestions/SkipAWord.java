package tanmay.StringQuestions;

public class SkipAWord {

	public static void main(String[] args) {
		String up = "xziadhoniwodh";
		String p = "";
		System.out.println(skipdhoni(p, up));
	}
	
	static String skipdhoni(String p,String up)
	{
		if(up.isEmpty())
		{
			return p;
		}
		
		if(up.startsWith("dhoni"))
		{
			return skipdhoni(p, up.substring(5));
		}
		else 
		{
			return skipdhoni(p+up.charAt(0), up.substring(1));
		}
	}

}
