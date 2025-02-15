import java.util.*;

class LinearAndBinaryChallenge{
	public static int smallestMisingPositiveNum(int []arr){
		HashSet<Integer> hs = new HashSet<>();
		for(int i : arr)
			if(i>0)
				hs.add(i);
		int i = 1;
		if(hs.contains(i))
			i++;
		return i;
	}
	public static int targetElementIdx(int []arr, int target){
		int left = 0, right = arr.length-1;
		while(left<=right){
			int mid = left + (right-left)/2;
			if(arr[mid] == target)
				return mid;
			else if(arr[mid]<target)
				left = mid+1;
			else
				right = mid-1;
		}
		return -1;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Element: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Smallest Missing Positive Number: "+smallestMisingPositiveNum(arr));
		Arrays.sort(arr);
		System.out.print("Enter Target Element: ");
		int target = sc.nextInt();
		System.out.println("Index of Target Element is: "+targetElementIdx(arr,target));
	}	
}