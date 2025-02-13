import java.util.*;

class SlidingWindow {
    public static int[] slidingWindowBruteForce(int[] arr, int k) {
        int n = arr.length;
        int ans[] = new int[n - k + 1];
        
        for (int i = 0; i <= n - k; i++) {
            int[] subArr = Arrays.copyOfRange(arr, i, i + k);            
            ans[i] = findMax(subArr);
        }
        return ans;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            max = Math.max(max, arr[i]);
        return max;
    }
	public static int[] slidingWindowEfficient(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (!deque.isEmpty() && deque.peekFirst() == i - k) deque.pollFirst();
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) deque.pollLast();
            deque.offerLast(i);
            if (i >= k - 1) ans[i - k + 1] = arr[deque.peekFirst()];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int ans1[] = slidingWindowBruteForce(arr, k);
		int ans2[] = slidingWindowEfficient(arr,k);
        System.out.println(Arrays.toString(ans1));
        System.out.println(Arrays.toString(ans2));
    }
}
