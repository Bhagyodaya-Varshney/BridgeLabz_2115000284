import java.util.*;

public class Compare_Linear_Binary_Search{
	static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int N = 1000000, target = N - 1;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) arr[i] = i;

        long linearStart = System.nanoTime();
        linearSearch(arr, target);
		long linearEnd = System.nanoTime();
        System.out.println("Linear Search Time Taken: " + (linearEnd - linearStart)/1e6 + " ms");

        long binaryStart = System.nanoTime();
        binarySearch(arr, target);
		long binaryEnd = System.nanoTime();
        System.out.println("Binary Search Time Taken: " + (binaryEnd - binaryStart)/1e6 + " ms");
    }
}
