import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
 
public class ChefJumping {
	static long a;
	
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedOutputStream bos = new BufferedOutputStream(System.out);
		String eol = System.getProperty("line.separator");
		byte[] eolb = eol.getBytes();
		try{
			String str = br.readLine();
			a = Long.parseLong(str);
			long check = a % 6;
			if(check == 0 || check == 1 || check == 3){
				bos.write("yes".getBytes());
				bos.write(eolb);
			}else{
				bos.write("no".getBytes());
				bos.write(eolb);
			}
			bos.flush();
			
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
