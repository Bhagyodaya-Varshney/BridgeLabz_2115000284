import java.util.*;

class StockSpan{
	public static int[] stockSpanFuncBruteForce(int []arr){
		int ans[] = new int[arr.length];
		for(int i=arr.length-1;i>=0;i--){
			int count = 1;
			for(int j = i-1;j>=0;j--){
				if(arr[i]>arr[j])	count++;
				else break;
			}
			ans[i] = count;
		}
		return ans;
	} 
	public static int[] stockSpanFuncEfficient(int []arr){
        int ans[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            ans[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }
        return ans;
	}
	public static void main(String[]args){
		int arr[] = {100, 80, 60, 70, 60, 75, 85};
		int ans1[] = stockSpanFuncBruteForce(arr);
		int ans2[] = stockSpanFuncEfficient(arr);
		System.out.println(Arrays.toString(ans1));
		System.out.println(Arrays.toString(ans2));
	}
}