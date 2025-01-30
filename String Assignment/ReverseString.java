import java.util.*;

public class ReverseString{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.next();
		String revString = reverseString(st);
		System.out.print("Reversed String is: "+revString);
		
	}
	public static String reverseString(String st){
		int i = 0, j = st.length() - 1;
        char[] charArray = new char[st.length()];
        
        while (i <= j) {
            charArray[i] = st.charAt(j);
            charArray[j] = st.charAt(i);
            i++;
            j--;
        }
        
        return new String(charArray);
	}
}