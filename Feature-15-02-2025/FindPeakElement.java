import java.util.*;

class FindPeakElement {
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1])
                right = mid;
            else
                left = mid + 1;
        }
        return arr[left];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Array:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Peak Element: " + findPeakElement(arr));
    }
}
