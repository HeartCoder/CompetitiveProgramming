import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.InputStream;
 
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author HeartCoder
 */
public class ChefAndSequence {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		ChefAndSequence solver = new ChefAndSequence();
		solver.solve(1, in, out);
		out.close();
	}
}
 
class ChefAndSequence {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int N = in.nextInt();
        int K = in.nextInt();
        long[] arr = new long[N];
        long[] d = new long[N];
        long old;
        HashMap<Long,Long> count = new HashMap<Long, Long>();
        HashMap<Long,Long> start = new HashMap<Long, Long>();
        for (int i = 0;i < N;++i) {
            arr[i] = Long.valueOf(in.next());
            if (i != 0) {
                d[i] = arr[i] - arr[i - 1];
                if (count.containsKey(d[i])) {
                    old = count.get(d[i]);
                    count.put(d[i],old + 1);
                    start.put(d[i],arr[i] - i * d[i]);
                    
                }else {
                    count.put(d[i],2L);
                    start.put(d[i],arr[i] - i * d[i]);
                }
            }
 
        }
       	long ans =Long.MAX_VALUE;
        long s;
        long cd = 0;
        Set<Long> keys = count.keySet();
      
        for (long k : keys) {
            if (count.get(k) + K >=N) {
               s =  start.get(k);
                if (ans > s) {
                    ans = s;
                    cd = k;
                    
                }else if (ans == s) {
                    if (k < cd) {
                        cd = k;
                        
                    }
                }
 
            }
        }
        
      
        for (int i = 0;i < N;++i) {
            if (i == 0)
                out.print(ans);
            else{
            	ans += cd;
            	out.print(" " +ans);
            }
                
        }
        out.println();
 
 
 
 
 
 
 
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
 
    public int nextInt() {
        return Integer.parseInt(next());
    }
 
} 
