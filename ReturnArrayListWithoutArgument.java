package tanmay.ArrayQuestions;

import java.util.ArrayList;

public class ReturnArrayListWithoutArgument {

	public static void main(String[] args) 
	{
		int[] arr = {3,7,5,8,9,7,2};
		
		System.out.println(findAllIndexUsingArrayListReturnType3(arr, 7, 0));
	}
	
	static ArrayList<Integer> findAllIndexUsingArrayListReturnType3(int[] arr, int target, int index)
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		if(index == arr.length)
			return list1;
		
		if(arr[index] == target)
			list1.add(index);
		ArrayList<Integer> collectIndex = findAllIndexUsingArrayListReturnType3(arr, target, index + 1);
		list1.addAll(collectIndex);
		
		return list1;
	}

}
