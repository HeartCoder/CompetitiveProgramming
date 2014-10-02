import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
 
public class Prime1  {
	static int[] primes;
	static int testCases;
	static int numberPrime;
	
		public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedOutputStream bos = new BufferedOutputStream(System.out);
		String eol = System.getProperty("line.separator");
		byte[] eolb = eol.getBytes();
		try{
			primes = new int[16000];
			primes[0] = 2;
			primes[1] = 3;
			primes[2] = 5;
			int iter = 7;
			int sqrt;
			int start = 0;
			boolean isPrime;
			numberPrime = 3;
			while(iter < 32000){
				isPrime = true;
				start = 0;
				sqrt = new Long(Math.round(Math.sqrt(iter))).intValue();
				while(primes[start] <= sqrt){
					if(iter % primes[start] == 0){
						isPrime = false;
						break;
					}
					start++;
				}
				if(isPrime){
					primes[numberPrime] = iter;
					numberPrime++;
				}
				iter += 2;
			}
		
			String str;
			str = br.readLine();
			testCases = Integer.parseInt(str);
			int consider = 0;
			
			for(int i = 0;i < testCases;i++){
				str = br.readLine();
				int blank = str.indexOf(" ");
				int n = Integer.parseInt(str.substring(0, blank));
				int m = Integer.parseInt(str.substring(blank + 1));
				boolean[] ans = new boolean[m - n + 1];
				for(int b = 0 ;b < m - n + 1;b++){
					ans[b] = true;
				}
				if(n == 1){
					ans[0] = false;
				}
				for(int q = 0;q < numberPrime;q++){
					int rem = n % primes[q];
					if(rem != 0){
						consider = n + primes[q] - rem; 
					}else{
						consider = n;
					}
					
					if(primes[q] == consider){
						consider = primes[q] * primes[q];
					}
					while(consider <= m){
						ans[consider - n] = false;
						consider += primes[q];
					}
					
				}
				
				for(int a = n;a <= m ;a++){
					if(ans[a - n]){
						bos.write(new Integer(a).toString().getBytes());
						bos.write(eolb);
						
					}
				}
				bos.write(eolb);;
				
				
				
			}
			bos.flush();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	
	
	
} 
