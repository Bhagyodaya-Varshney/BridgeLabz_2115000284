import java.util.*;

public class SortJobApplication{
    public static void heapSort(int[]arr){
		int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) 
			heapify(arr, n, i);
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
	}
	public static void heapify(int[] arr, int n, int i) {
        int max = i, left = 2 * i + 1, right = 2 * i + 2;
		
        if (left < n && arr[left] > arr[max]) 
			max = left;
        if (right < n && arr[right] > arr[max]) 
			max = right;
        if (max != i) {
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            heapify(arr, n, max);
        }
    }
	public static void main(String[]args){
		int[] salaries = {60000, 10000, 90000, 25000, 50000, 70000};
        heapSort(salaries);
		System.out.println(Arrays.toString(salaries));
	}
}
