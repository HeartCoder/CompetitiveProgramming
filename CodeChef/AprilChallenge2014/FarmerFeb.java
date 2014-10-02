import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class FarmerFeb {
	static int first;
	static int second;
	static int third;
	static int testCases;
	static int ans;
	static int[] primes;
	
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedOutputStream bos = new BufferedOutputStream(System.out);
		String eol = System.getProperty("line.separator");
		primes = new int[1000];
		primes[0] = 2;
		primes[1] = 3;
		primes[2] = 5;
		int iter = 7;
		int numberOfPrimes = 3;
		int start = 0;
		int sqrt;
		boolean isPrime;
		while(iter < 2100){
			sqrt = new Double(Math.round(Math.sqrt(iter))).intValue();
			start = 0;
			isPrime = true;
			while(primes[start] <= sqrt){
				if(iter % primes[start] == 0){
					isPrime = false;
					break;
				}
				start++;
			}
			if(isPrime){
				primes[numberOfPrimes++] = iter;
			}
			iter += 2;
		}
		byte[] eolb = eol.getBytes();
		try{
			int index = 0;
			String str = br.readLine();
			testCases = Integer.parseInt(str);
			for(int i = 0;i < testCases;i++){
				str = br.readLine();
				StringTokenizer st = new StringTokenizer(str);
				first =Integer.parseInt(st.nextToken());
				second = Integer.parseInt(st.nextToken());
				ans = first + second;
				for(int j = 0;j < numberOfPrimes;j++){
					if(primes[j] > ans){
						index = j;
						break;
					}
				}
				ans = primes[index] - ans;
				bos.write(new Integer(ans).toString().getBytes());
				bos.write(eolb);
			}
			bos.flush();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
} 
