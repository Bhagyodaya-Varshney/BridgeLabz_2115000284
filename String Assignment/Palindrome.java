import java.util.*;

public class Palindrome{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.next();
			
		if(isPalindrome(st))	System.out.print("Given String is Palindrome");
		else	System.out.print("Given String is Not Palindrome");
	}
	public static boolean isPalindrome(String st){
		int i=0,j=st.length()-1;
		while(i<=j){
			if(st.charAt(i) != st.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
}