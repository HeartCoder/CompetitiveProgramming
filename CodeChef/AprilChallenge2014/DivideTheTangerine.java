import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class DivideTheTangerine {
	static int testCases;
	static int numberOfSegments;
	static int chefParts;
	static int boyParts;
	static int[] start;
	static int[] end;
	static int[] boyCheck;
	static int first;
	static int second;
	
	public static void main(String[] agrs){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedOutputStream bos = new BufferedOutputStream(System.out);
		String eol = System.getProperty("line.separator");
		byte[] eolb = eol.getBytes();
		try{
			String str = br.readLine();
			testCases = Integer.parseInt(str);
			for(int j = 0;j < testCases;j++){
				str = br.readLine();
				StringTokenizer st = new StringTokenizer(str);
				numberOfSegments = Integer.parseInt(st.nextToken());
				chefParts = Integer.parseInt(st.nextToken());
				boyParts = Integer.parseInt(st.nextToken());
				start = new int[chefParts];
				end = new int[chefParts];
				for(int i = 0;i < chefParts;i++){
					str = br.readLine();
					StringTokenizer input = new StringTokenizer(str);
					start[i] = Integer.parseInt(input.nextToken());
					end[i] = Integer.parseInt(input.nextToken());
				}
				int index = 0;
				boyCheck = new int[ 2 * boyParts];
				for(int i = 0;i < boyParts;i++){
					str = br.readLine();
					StringTokenizer input = new StringTokenizer(str);
					first = Integer.parseInt(input.nextToken());
					second = Integer.parseInt(input.nextToken());
					boyCheck[index++] = first - 1;
					boyCheck[index++] = second;
				}
				boolean flag = true;
				for(int i = 0;i < chefParts;i++){
					for(int k = 0;k < index;k++){
						if(start[i] < end[i]){
							if(boyCheck[k] >= start[i] && boyCheck[k] < end[i]){
								flag = false;
								break;
							}
						}else if(start[i] > end[i]){
							if(boyCheck[k] >= start[i] || boyCheck[k] < end[i]){
								flag = false;
								break;
							}
						}
						
					}
					if(flag == false){
						break;
					}
				}
				if(flag){
					bos.write("Yes".getBytes());
					bos.write(eolb);
				}else{
					bos.write("No".getBytes());
					bos.write(eolb);
				}
				
				
				
				
				
			}
			bos.flush();
			
			
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	
}
  
