package tanmay.Level_1_Questions;

public class BinarySearch {

	public static void main(String[] args) {
		int[] num = {1,3,5,7,9,11,33};
		System.out.println(binarySearch(num,0,num.length-1,9));
		
	}
	
	static int binarySearch(int[] num ,int start, int end, int target)
	{
		if(start > end)
			return -1;
		
		int mid = start + (end - start)/2;
		
		if(num[mid] == target)
			return mid;
		else if (num[mid] > target) 
			return binarySearch(num, start, mid-1, target);
		else
			return binarySearch(num, mid+1, end, target);
	}

}
