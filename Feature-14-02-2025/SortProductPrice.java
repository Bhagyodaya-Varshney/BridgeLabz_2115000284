import java.util.*;

public class SortProductPrice{
    public static void quickSort(int[]arr,int low,int high){
		if(low<high){
			int mid = partition(arr,low,high);
			quickSort(arr,low,mid-1);
			quickSort(arr,mid+1,high);
		}
	}
	public static int partition(int[]arr,int low,int high){
		int pivot = arr[high];
		int i = low-1;
		for(int j=low;j<high;j++){
			if(arr[j]<pivot){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}
	public static void main(String[]args){
		int[]prices={200,400,800,300,700,400};
		quickSort(prices,0,prices.length-1);
		System.out.println(Arrays.toString(prices));
	}
}
