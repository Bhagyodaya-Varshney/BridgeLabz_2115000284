import java.util.*;

public class ToggleCase{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.nextLine();
		String ans = findToggledStr(st);
		System.out.print("Toggled String is: "+ans);
	}
	public static String findToggledStr(String st){
		String ans = "";
		for(int i=0;i<st.length();i++){
			if(Character.isLowerCase(st.charAt(i)))	ans += Character.toUpperCase(st.charAt(i));
			else if(Character.isUpperCase(st.charAt(i)))	ans += Character.toLowerCase(st.charAt(i));
			else ans += st.charAt(i);
		}
		return ans;
	}
}