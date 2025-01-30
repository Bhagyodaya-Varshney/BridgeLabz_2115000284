import java.util.*;

public class LongestWordInSentence{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Sentence: ");
		String sentence = sc.nextLine();
		String ans = findLongestWord(sentence);
		
		System.out.print("Longest Word in the Sentence is: "+ans);
	}
	public static String findLongestWord(String st){
		String []Words = st.split(" ");
		String LongestWord = "";
		for(String word : Words)	
			if(word.length() >= LongestWord.length())	
				LongestWord = word;
		return LongestWord;
	}
}