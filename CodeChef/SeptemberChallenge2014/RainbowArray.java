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
public class RainbowArray {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		ChefAndRainbowArray2 solver = new ChefAndRainbowArray2();
			solver.solve(1, in, out);
		out.close();
	}
}
 
class ChefAndRainbowArray2 {
    private static long[][] ncr;
    private static final long MOD = 1000000007L;
 
    static {
        ncr = new long[500007][7];
        for (int i = 0;i < 500007;++i) {
            for (int j = 0;j <= Math.min(i,6);++j) {
                if (j == 0 || j == i) {
                    ncr[i][j] = 1;
                }else {
                    ncr[i][j] = (ncr[i - 1][j] % MOD + ncr[i - 1][j - 1] % MOD) % MOD;
                }
            }
        }
    }
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        long ans = 0,increment = 0,times = 0;
        if (n == 13 || n == 14) {
            out.println("1");
            return;
        }
        if (n < 13) {
            out.println(ans);
        }else {
            increment = n - 13;
            increment /= 2;
           out.println(ncr[(int)increment + 6][6]);
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
