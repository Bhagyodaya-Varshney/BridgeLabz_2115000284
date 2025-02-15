import java.util.*;

class TargetIn2DMatrix{
	public static boolean findElement(int [][]arr, int target){
		if (arr == null || arr.length == 0 || arr[0].length == 0) 
            return false;
		
		int rows = arr.length, cols = arr[0].length;
		int left = 0, right = (rows * cols) - 1;
		
		while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols;
            int col = mid % cols;

            if (arr[row][col] == target) return true;
            else if (arr[row][col] < target) left = mid + 1;
            else right = mid - 1;
        }
		
		return false;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Rows:");
		int rows = sc.nextInt();
		System.out.print("Number of Columns:");
		int columns = sc.nextInt();
		
		int [][]arr = new int[rows][columns];
		System.out.println("Enter Elements:");
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
				arr[i][j] = sc.nextInt();
		System.out.print("Enter the Target Element: ");
		int target = sc.nextInt();
		
		System.out.println("Element Found Status: "+findElement(arr,target));
	}
}