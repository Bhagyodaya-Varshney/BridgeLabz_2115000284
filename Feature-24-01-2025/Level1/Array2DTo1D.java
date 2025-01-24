import java.util.*;

public class Array2DTo1D{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows and Column: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
		
		int[][] array2D = new int[r][c];
        int[] array1D = new int[r*c];
		
		for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter elements for 2D Array:");
                array2D[i][j] = sc.nextInt();
            }
        }
		
		int idx = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array1D[idx++] = array2D[i][j];
            }
        }

        System.out.println("1D Array:");
        for (int i : array1D) {
            System.out.print(i + " ");
        }
		
	}
}