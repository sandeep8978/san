import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout=new FileOutputStream ("D:\\IMG_20161229.jpg");
		String s="welcome Sandeep";
		byte b[]=s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("Sucess......");

	}

}
