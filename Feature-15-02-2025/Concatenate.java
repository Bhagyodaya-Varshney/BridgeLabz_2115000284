import java.util.*;

class Concatenate{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Strings:");
		int n = sc.nextInt();
		
		StringBuffer stbu = new StringBuffer();
		for(int i=0;i<n;i++)
			stbu.append(sc.next());
			
		
		System.out.println(stbu.toString());
	}
}