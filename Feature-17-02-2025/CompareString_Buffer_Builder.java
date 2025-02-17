import java.util.*;

class CompareString_Buffer_Builder{
	public static void main(String[]args){
		int N = 1000;
		String concateString = "Java";
		String string = "";
		long  stringStart = System.nanoTime();
		for(int i=0;i<N;i++)
			string += concateString;
		long  stringEnd = System.nanoTime();
		System.out.println("Time Taken By String: "+(stringEnd-stringStart)/1e6+" ms");
		
		StringBuilder sb = new StringBuilder();
		long  sbStart = System.nanoTime();
		for(int i=0;i<N;i++)
			sb.append(concateString);
		long  sbEnd = System.nanoTime();
		System.out.println("Time Taken By String Builder: "+(sbEnd-sbStart)/1e6+" ms");
		
		StringBuffer sbu = new StringBuffer();
		long  sbuStart = System.nanoTime();
		for(int i=0;i<N;i++)
			sbu.append(concateString);
		long  sbuEnd = System.nanoTime();
		System.out.println("Time Taken By String Buffer: "+(sbuEnd-sbuStart)/1e6+" ms");
	}
}