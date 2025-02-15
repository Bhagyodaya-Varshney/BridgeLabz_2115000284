import java.util.*;

class FindSmallestIdx {
    public static int findSmallestIdx(int[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] > arr[right])
                left = mid + 1;
            else
                right = mid;
        }
        return left+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int smallestIndex = findSmallestIdx(arr);
        System.out.println("Smallest Number Index: " + smallestIndex);
    }
}
