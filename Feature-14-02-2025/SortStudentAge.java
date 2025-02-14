import java.util.*;

public class SortStudentAge{
    public static void countingSort(int[]arr, int range){
		int[] count = new int[range + 1];
		int[] ans = new int[arr.length];
		
        for (int num : arr) 
			count[num]++;
        for (int i = 1; i <= range; i++) 
			count[i] += count[i - 1];
        for (int i = arr.length - 1; i >= 0; i--) 
			ans[--count[arr[i]]] = arr[i];
        System.arraycopy(ans, 0, arr, 0, arr.length);
	}
	public static void main(String[]args){
		int[]ages={12,15,11,18,14,10,13};
		countingSort(ages,18);
		System.out.println(Arrays.toString(ages));
	}
}
