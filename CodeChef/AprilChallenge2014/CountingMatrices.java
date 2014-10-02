import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
 
 
public class CountingMatrices {
	static int testCases;
	static int traceValue;
	
	public static void main(String[] agrs){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedOutputStream bos = new BufferedOutputStream(System.out);
		String eol = System.getProperty("line.separator");
		byte[] eolb = eol.getBytes();
		try{
			String str = br.readLine();
			testCases = Integer.parseInt(str);
			for(int i = 0;i < testCases;i++){
				str = br.readLine();
				traceValue = Integer.parseInt(str);
				traceValue--;
				
				int next = 1;
				int val;
				long ans = 0;
				while(traceValue >= next){
					val = next * traceValue;
					if(traceValue != next){
						ans = ans + 2 * cal(val);
					}else{
						ans = ans + cal(val);
					}
					next++;
					traceValue--;
					
				}
				bos.write(new Long(ans).toString().getBytes());
				bos.write(eolb);
				
				
				
				
			}
			bos.flush();
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
	}
	
	
	
	public static long cal(int val){
		double start = 2;
		int end = val - 1;
		double add;
		double ans = 2 * end - 1;
		double sqrt = Math.sqrt(val);
		sqrt = Math.ceil(sqrt);
		while(start < sqrt){
			add = Math.ceil(val / start);
			add = add - start;
			ans = ans + 2 * add - 1;
			start++;
		}
		
		return Math.round(ans);
		
	}
	
}
