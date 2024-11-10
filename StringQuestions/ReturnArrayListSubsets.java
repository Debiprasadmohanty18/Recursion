package tanmay.StringQuestions;

import java.util.ArrayList;

public class ReturnArrayListSubsets {
	public static void main(String[] args) {
		String s = "asd";
		String p = "";
		System.out.println(subsetArrayList(p, s));
	}
	
	static ArrayList<String> subsetArrayList(String p,String s)
	{
		if(s.isEmpty())
		{
			ArrayList<String> list = new ArrayList<String>();
			list.add(p);
			return list;
		}
		
		char ch = s.charAt(0);
		
		ArrayList<String> list1 = subsetArrayList(p+ch, s.substring(1));
		ArrayList<String> list2 = subsetArrayList(p, s.substring(1));
		
		list1.addAll(list2);
		return list1;
	}
}
