import java.io.*;

class ByteStreamToCharacterStream{
	public static void main(String[]args){
		try{
			FileInputStream fis = new FileInputStream("TestFile1.txt");
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			
			int data;
            while ((data = isr.read()) != -1) {
                System.out.print((char)data);
            }
			
			isr.close();
			fis.close();
		}
		catch(Exception e){
			System.out.println("Exception: "+e);
		}
	}
}
