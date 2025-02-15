import java.util.*;

class ReverseString{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		StringBuilder stb = new StringBuilder(st);
		stb.reverse();
		System.out.println(stb.toString());
	}
}