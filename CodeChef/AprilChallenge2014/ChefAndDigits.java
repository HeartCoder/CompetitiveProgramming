import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
 
public class ChefAndDigits {
	static int n,m;
	static int index;
	static long[] hash;
	
	public static void main(String[] agrs){
		try{
			String str;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedOutputStream bos = new BufferedOutputStream(System.out);
			String eol = System.getProperty("line.separator");
			byte[] eolb = eol.getBytes();
			str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			str = br.readLine();
			hash = new long[100000];
			int len = str.length();
			long value = 0;
			for(int j = 0;j <= 9;j++){
				value = 0;
				for(int i = 0;i < len;i++){
					
					if(Integer.parseInt(new Character(str.charAt(i)).toString()) == j){
						hash[i] = value;
					}
					value += Math.abs(j - Integer.parseInt(new Character(str.charAt(i)).toString()) );
					
					
				
				}
			}
			for(int k = 0;k < m;k++){
				str = br.readLine();
				index = Integer.parseInt(str);
				bos.write(new Long(hash[index - 1]).toString().getBytes());
				bos.write(eolb);	
			}
			bos.flush();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	
 
}
