import java.util.*;

public class SortExamScore{
    public static void selectionSort(int[]marks){
		for(int i=0;i<marks.length-1;i++){
			int min=i;
			for(int j=i+1;j<marks.length;j++){
				if(marks[j]<marks[min])min=j;
			}
			int temp=marks[i];
			marks[i]=marks[min];
			marks[min]=temp;
		}
	}
	public static void main(String[]args){
		int[]marks = {70,90,84,80,75,40};
		selectionSort(marks);
		System.out.println(Arrays.toString(marks));
	}
}
