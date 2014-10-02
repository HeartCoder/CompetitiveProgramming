import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
 
 
public class ShortestPathInBinaryTrees {
	static int queries;
	static int node1;
	static int node2;
	static int[] path1;
	static int[] path2;
	static int[] actualOne;
	static int[] actualTwo;
	
	
	public static void main(String[] agrs){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedOutputStream bos = new BufferedOutputStream(System.out);
		String eol = System.getProperty("line.separator");
		byte[] eolb = eol.getBytes();
		try{
			String str = br.readLine();
			queries = Integer.parseInt(str);
			path1 = new int[30];
			path2 = new int[30];
			for(int i = 0;i < queries;i++){
				
				str = br.readLine();
				StringTokenizer st = new StringTokenizer(str);
				node1 = Integer.parseInt(st.nextToken());
				node2 = Integer.parseInt(st.nextToken());
				int indexOne = 0;
				while(node1 >= 1){
					path1[indexOne++] = node1;
					node1 /= 2;
					
				}
				
				int indexTwo = 0;
				while(node2 >= 1){
					path2[indexTwo++] = node2;
					node2 /= 2;
					
				}
				actualOne = Arrays.copyOf(path1,indexOne);
				actualTwo = Arrays.copyOf(path2,indexTwo);
				int choice = Math.min(indexOne, indexTwo);
				int ans = 0;
				int val = 0;
				boolean flag = false;
				if(choice == indexOne){
					Arrays.sort(actualTwo);
					for(int j = 0;j < choice;j++){
						ans = Arrays.binarySearch(actualTwo,actualOne[j]);
						if(ans >= 0){
							val = indexTwo - ans - 1 + j;
							break;
						}
					
						
					}
				}else{
					Arrays.sort(actualOne);
					for(int k = 0;k < choice;k++){
						ans = Arrays.binarySearch(actualOne,actualTwo[k]);
						if(ans >= 0){
							val = indexOne - ans - 1 + k;
							break;
						}
					}
				}
				bos.write(new Integer(val).toString().getBytes());
				bos.write(eolb);
			}
			bos.flush();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
	}
} 
