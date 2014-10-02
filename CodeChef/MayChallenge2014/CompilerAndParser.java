import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
 
public class CompilerAndParser {
	static int testCases;
	static Stack<Character> st;
	
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedOutputStream bos = new BufferedOutputStream(System.out);
		String eol = System.getProperty("line.separator");
		byte[] eolb = eol.getBytes();
		try{
			String str = br.readLine();
			int len;
			testCases = Integer.parseInt(str);
			for(int i = 0;i < testCases;i++){
				str = br.readLine();
				int ans = 0;
				len = str.length();
				int another = 0;
				boolean flag = false;
				st = new Stack<Character>();
				for(int j = 0;j < len;j++){
					if(str.charAt(j) == '<'){
						st.push(new Character(str.charAt(j)));
					}else if(str.charAt(j) == '>'){
						if(st.empty()){
							bos.write(new Integer(another).toString().getBytes());
							flag = true;
							break;
						}else{
							st.pop();
							ans = ans + 2;
							if(st.empty()){
								another = another + ans;
								ans = 0;
							}
						}
					}
				}
				if(!flag){
					bos.write(new Integer(another).toString().getBytes());
				}
				bos.write(eolb);
				
			}
			bos.flush();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
