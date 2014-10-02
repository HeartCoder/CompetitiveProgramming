import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.InputStream;
 
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author HeartCoder
 */
public class FunWithRotationMain {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		FunWithRotation solver = new FunWithRotation();
		solver.solve(1, in, out);
		out.close();
	}
}
 
class FunWithRotation {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int N = in.nextInt();
        int M = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0;i < N;++i) {
            arr[i] = in.nextInt();
        }
        int start,end;
        start = 0;
        end = N - 1;
        for (int i = 0;i < M;++i) {
            String q = in.next();
            int incr = Integer.parseInt(in.next());
            if (incr > N) {
            	incr %= N;
            	
            }
            if (q.equals("A")) {
            	
                start = (start - incr + N) % N;
                end = (end - incr + N) % N;
            }else if (q.equals("C")) {
                start = (start + incr) % N;
                end = (end + incr) % N;
            }else {
            	out.println(arr[(start + incr - 1) % N]);
                
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
 
    public int nextInt() {
        return Integer.parseInt(next());
    }
 
}
 
