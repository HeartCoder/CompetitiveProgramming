import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Stone {
	static int n;
	static int k;
	static long[] numbers;
	
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedOutputStream bos = new BufferedOutputStream(System.out);
		String eol = System.getProperty("line.separator");
		byte[] eolb = eol.getBytes();
		byte[] spaceb = " ".getBytes();
		try{
			String str;
			str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			numbers = new long[n];
			str = br.readLine();
			st = new StringTokenizer(str);
			int index = 0;
			long max = 0;
			long min = Integer.MAX_VALUE;
			while(st.hasMoreTokens()){
				numbers[index] = Integer.parseInt(st.nextToken());
				if(max < numbers[index]){
					max = numbers[index];
				}else if(min > numbers[index]){
					min = numbers[index];
				}
				index++;
			}
			if(k == 0){
				for(int i = 0;i < n;i++){
					bos.write(new Long(numbers[i]).toString().getBytes());
					bos.write(spaceb);
				}
			}else{
				for(int i = 0;i < n;i++){
					numbers[i] = max - numbers[i];
				}
				max = max - min;
				if(k % 2 == 1){
					for(int i = 0;i < n;i++){
						bos.write(new Long(numbers[i]).toString().getBytes());
						bos.write(spaceb);
					}
				}else{
					for(int i = 0;i < n;i++){
						numbers[i] = max - numbers[i];
						bos.write(new Long(numbers[i]).toString().getBytes());
						bos.write(spaceb);
					}
				}
				
			}
			
			
			bos.write(eolb);
			bos.flush();
		
			
			
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
	}
}
 
