package tanmay.ArrayQuestions;

import java.util.ArrayList;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {3,7,5,8,9,7,2};
		System.out.println(find(arr, 9, 0));
		System.out.println(findIndex(arr, 9, 0));
		findAllIndex(arr, 7, 0);
		System.out.println(list);
	}
	
	static boolean find(int[] arr, int target, int index)
	{
		if(index == arr.length)
			return false;
		
		return arr[index] == target || find(arr, target, index + 1);
	}
	
	
	static int findIndex(int[] arr, int target, int index)
	{
		if(index == arr.length)
			return -1;
		
		if(arr[index] == target)
			return index;
		else
			return findIndex(arr, target, index + 1);
	}
	
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static void findAllIndex(int[] arr, int target, int index)
	{
		if(index == arr.length)
			return;
		
		if(arr[index] == target)
			list.add(index);
		
		findAllIndex(arr, target, index + 1);
	}
	
	static ArrayList findAllIndexUsingArrayListReturnType(int[] arr, int target, int index, ArrayList<Integer> list)
	{
		if(index == arr.length)
			return list;
		
		if(arr[index] == target)
			list.add(index);
		return findAllIndexUsingArrayListReturnType(arr, target, index + 1, list);
	}

}
