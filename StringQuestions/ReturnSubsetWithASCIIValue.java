package tanmay.StringQuestions;

import java.util.ArrayList;

public class ReturnSubsetWithASCIIValue {

	public static void main(String[] args) {
		String s = "abc";
		String p = "";
		System.out.println(subsetArrayListWithASCII(p, s));
	}

	static ArrayList<String> subsetArrayListWithASCII(String p, String s) 
	{
		if(s.isEmpty())
		{
			ArrayList<String> list = new ArrayList<String>();
			list.add(p);
			return list;
		}
		
		char ch = s.charAt(0);
		
		ArrayList<String> list1 = subsetArrayListWithASCII(p+ch, s.substring(1));
		ArrayList<String> list2 = subsetArrayListWithASCII(p, s.substring(1));
		ArrayList<String> list3 = subsetArrayListWithASCII(p+(ch+0), s.substring(1));
		
		list1.addAll(list2);
		list1.addAll(list3);
		return list1;
	}

}
