import java.util.*;

class FirstLastOccurrence{
	public static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, first = -1;
        while (left <= right){
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return first;
    }
	public static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, last = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the sorted Array:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
		
		System.out.println("Enter the Target Element:");
        int target = sc.nextInt();
		
		System.out.println("First Occurence: "+firstOccurrence(arr,target));
		System.out.println("Last Occurence: "+lastOccurrence(arr,target));
	}
}