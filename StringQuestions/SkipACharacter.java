package tanmay.StringQuestions;

public class SkipACharacter {

	public static void main(String[] args) {
		String s = "abbcaac";
		int ind = 0;
		char ch = 'a';
		System.out.println(skip(s,ind,ch));
	}

	static StringBuilder sb = new StringBuilder();
	static String skip(String s, int i, char ch)
	{
		if(i > s.length()-1)
			return sb.toString();
		
		if(s.charAt(i) != ch)
			sb.append(s.charAt(i));
		
		return skip(s, i+1, ch);
	}
}
