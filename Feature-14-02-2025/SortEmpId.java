import java.util.*;

public class SortEmpId{
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int k = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > k) arr[j + 1] = arr[j--];
            arr[j + 1] = k;
        }
    }
	public static void main(String[]args){
		int []arr = {801,754,852,824,601,910};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
