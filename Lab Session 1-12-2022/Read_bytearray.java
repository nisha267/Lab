package lab;
//question 3
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read_bytearray {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream f=new FileInputStream("C:\\TestInputoutput\\Test2.txt");
			byte fout[]=new byte[1024];
			int i=0;
			while((i=f.read(fout))>0) {
				System.out.println(new String(fout,0,i));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
