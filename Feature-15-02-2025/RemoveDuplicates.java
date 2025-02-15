import java.util.*;

class RemoveDuplicates{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		System.out.println(removeDuplicates(st));
	}
	public static String removeDuplicates(String st){
		StringBuilder stb = new StringBuilder();
		HashSet<Character> hs = new HashSet<>();
		
		for(char ch : st.toCharArray()){
			if(!hs.contains(ch))
				stb.append(ch);
			hs.add(ch);
		}
		
		return stb.toString();
	}
}