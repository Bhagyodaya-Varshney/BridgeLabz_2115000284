import java.util.*;

public class RemoveSpecificChar{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.nextLine();
		System.out.print("Enter the Character to remove: ");
		char c = sc.next().charAt(0);
	
		String ans = charRemoveFunc(st,c);
		System.out.print(ans);
		
	}
	public static String charRemoveFunc(String st, char c){
		String ans = "";
		for(int i=0;i<st.length();i++){
			if(c != st.charAt(i))	ans += st.charAt(i);
		}
		
		return ans;
	}
}