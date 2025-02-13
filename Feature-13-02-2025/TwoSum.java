import java.util.*;

class TwoSum{
	public static void twoSumBruteForce(int arr[], int targetSum){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] + arr[j] == targetSum){
					System.out.println("["+i+","+j+"]");
				}
			}
		}
	}
	public static int[] twoSumEfficient(int arr[], int targetSum){
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i < arr.length; i++){
			int num = targetSum - arr[i];
			if(hm.containsKey(num))	
				return new int[]{hm.get(num),i};
			hm.put(arr[i],i);
		}
		
		return new int[]{-1,-1};
	}
	public static void main(String[]args){
		int arr[] = {2,7,11,15,2};
		int targetSum = 9;
		twoSumBruteForce(arr,targetSum);
		int ans[] = twoSumEfficient(arr,targetSum);
		System.out.println(ans[0]+" "+ans[1]);
	}
}