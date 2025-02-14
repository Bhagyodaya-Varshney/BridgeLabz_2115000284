import java.util.*;

public class SortStudentMarks {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swap;
        for (int i = 0; i < n - 1; i++) {
            swap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) break;
        }
    }
	public static void main(String[]args){
		int []arr = {80,75,85,82,60,90};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
