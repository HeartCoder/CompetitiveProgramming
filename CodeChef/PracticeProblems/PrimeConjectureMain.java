import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Arrays;
 
public class PrimeConjectureMain {
	
	static int number;
	static int[] primes;
	static int[] primeSquares;
	static int[] primeCubes;
	static int primel;
	static int squarel;
	static int cubel;
	
	
	public static void main(String[] args){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedOutputStream bos = new BufferedOutputStream(System.out);
		String eol = System.getProperty("line.separator");
		byte[] eolb = eol.getBytes();
		byte[] spaceb = " ".getBytes();
		primes = new int[1000000];
		primeSquares = new int[1000];
		primeCubes = new int[100];
		primes[0] = 2;
		primes[1] = 3;
		primes[2] = 5;
		primeSquares[0] = 4;
		primeSquares[1] = 9;
		primeSquares[2] = 25;
		primeCubes[0] = 8;
		primeCubes[1] = 27;
		primeCubes[2] = 125;
		primel = 3;
		squarel = 3;
		cubel = 3;
		int iter = 7;
		int start;
		boolean isPrime;
		while(iter < 1000001){
			isPrime = true;
			start = 0;
			int sqrt = new Long(Math.round(Math.sqrt(iter))).intValue();
			while(primes[start] <= sqrt){
				if(iter % primes[start] == 0){
					isPrime = false;
					break;
				}
				start++;
			}
			if(isPrime){
				primes[primel++] = iter;
				
				if(iter < 1000){
					primeSquares[squarel++] = iter * iter;
				
				}
				if(iter < 100){
					primeCubes[cubel++] = (iter * iter) * iter;
				
				}
			
			}
			iter += 2;
		}
		
		
		
		
		try{
			int toFind;
			String str = br.readLine();
			number = Integer.parseInt(str);
			while(number != 0){
				boolean flag = false;
				for(int i = 0;i < cubel;i++){
					for(int j = 0;j < squarel;j++){
						toFind = number - primeCubes[i] - primeSquares[j];
						int index = Arrays.binarySearch(primes, 0,primel,toFind);
						if(index >= 0){
							bos.write(new Integer(toFind).toString().getBytes());
							bos.write(spaceb);
							bos.write(new Integer(primes[j]).toString().getBytes());
							bos.write(spaceb);
							bos.write(new Integer(primes[i]).toString().getBytes());
							bos.write(eolb);
							flag = true;
							break;
						
						}
						
					}
					if(flag)
						break;
				}
				if(!flag){
	
						bos.write("0 0 0".getBytes());
						bos.write(eolb);
					
				
				}
				str = br.readLine();
				number = Integer.parseInt(str);
				
				
			}
			bos.flush();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		
	}
		
}
 
