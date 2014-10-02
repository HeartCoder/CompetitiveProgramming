import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.math.BigInteger;
 
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author HeartCoder
 */
public class Factorization {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Factorisation solver = new Factorisation();
        int testCount = Integer.parseInt(in.next());
        for (int i = 1; i <= testCount; i++)
            solver.solve(i, in, out);
        out.close();
    }
}
 
class Factorisation {
    static long[] primes;
    static  int numberPrime;
    static {
        primes = new long[5000];
        primes[0] = 2;
        primes[1] = 3;
        primes[2] = 5;
        int iter = 7;
        int sqrt;
        int start = 0;
        boolean isPrime;
        numberPrime = 3;
        while(iter < 36000){
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
    }
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        String input = in.next();
 
        boolean big = false;
        BigInteger N = BigInteger.ONE;
        long n = 0;
        if (input.length() > 18) {
           N = new BigInteger(input);
            big = true;
        }else {
            n = Long.valueOf(input);
        }
        int index = 0;
        long count = 0;
        boolean flag;
        int[] times = new int[5000];
        boolean[] check = new boolean[5000];
        while (true) {
            if (big) {
                flag = N.mod(BigInteger.valueOf(primes[index])).equals(BigInteger.ZERO);
                if (flag) {
                    check[index] = true;
                    while (flag && index <= numberPrime) {
                        count++;
                        times[index]++;
                        N = N.divide(BigInteger.valueOf(primes[index]));
                        flag = N.mod(BigInteger.valueOf(primes[index])).equals(BigInteger.ZERO);
                    }
 
                }
                index++;
                if (N.equals(BigInteger.ONE) || index == numberPrime) {
                    break;
                }
            }else {
               
                flag = (n % primes[index] == 0);
                if (flag) {
                    check[index] = true;
                    while (flag && index <= numberPrime) {
                        count++;
                        times[index]++;
                        n = n / primes[index];
                        flag = (n % primes[index] == 0);
                    }
 
                }
                index++;
                if (n == 1 || index == numberPrime) {
                    break;
                }
            }
 
        }
        if (big) {
            if (N.equals(BigInteger.ONE)) {
                out.println(count);
            } else {
                out.println(count + 1);
            }
        }else {
            if (n == 1) {
                out.println(count);
            }else {
                out.println(count + 1);
            }
        }
        for (int i = 0;i < 5000;++i) {
            if (check[i]) {
                for (int j = 0;j < times[i];++j) {
                    out.println(primes[i]);
                    count--;
                }
            }
            if (count == 0) {
                break;
            }
        }
        if (big ) {
            if (!N.equals(BigInteger.ONE)) {
                out.println(N.toString());
            }
        }else {
            if (n != 1) {
                out.println(n);
            }
        }
 
 
    }
}
 
class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;
 
    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream), 32768);
        tokenizer = null;
    }
 
    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }
 
}  
