package tanmay.StringQuestions;

public class SkipAWordIfItIsOnlyDhoniNotMSDhoni {

	public static void main(String[] args) {
		String up = "Viratms Kohli";
		String p = "";
		System.out.println(skipDhoni(p, up));
	}
	
	static String skipDhoni(String p, String up)
	{
		if(up.isEmpty())
		{
			return p;
		}
		
		if(up.startsWith("ms") &&! up.startsWith("msdhoni"))
		{
			return skipDhoni(p, up.substring(2));
		}
		else 
		{
			return skipDhoni( p+up.charAt(0), up.substring(1));
		}
	}

}
