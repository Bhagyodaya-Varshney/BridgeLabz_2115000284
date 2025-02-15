import java.io.*;
import java.util.*;

class WriteToFile{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			FileWriter fw = new FileWriter("TestFile.txt");
			
			System.out.print("Enter to Write:");
			String line;
			while(true){
				line = sc.nextLine();
				if("-1".equals(line))
					break;
				fw.write(line+"\n");
			}
			fw.close();
			System.out.println("Write Successfully");
			
		}
		catch(Exception e){
			System.out.println("Exception: "+e);
		}
	}
}