package tanmay.ArrayQuestions;

import java.util.ArrayList;

public class ArrayListAsReturnType {

	public static void main(String[] args) {
		int[] arr = {3,7,5,8,9,7,2};
		
		System.out.println(findAllIndexUsingArrayListReturnType(arr, 7, 0,list));
		
		findAllIndexUsingArrayListReturnType2(arr, 7, 0, list);
		System.out.println(list);
	}
	
	
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static ArrayList findAllIndexUsingArrayListReturnType(int[] arr, int target, int index, ArrayList<Integer> list)
	{
		if(index == arr.length)
			return list;
		
		if(arr[index] == target)
			list.add(index);
		return findAllIndexUsingArrayListReturnType(arr, target, index + 1, list);
	}
	
	static ArrayList<Integer> findAllIndexUsingArrayListReturnType2(int[] arr, int target, int index, ArrayList<Integer> list1)
	{
		if(index == arr.length)
			return list1;
		
		if(arr[index] == target)
			list1.add(index);
		return findAllIndexUsingArrayListReturnType2(arr, target, index + 1, list1);
	}

}
