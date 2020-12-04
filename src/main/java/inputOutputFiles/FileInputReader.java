package inputOutputFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputReader {
	
	
	public static void main(String[] args) {
		
		FileInputStream fis= null;
		FileOutputStream fos = null;
		
		 try {
			fis = new FileInputStream("input.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		

	}

}
}