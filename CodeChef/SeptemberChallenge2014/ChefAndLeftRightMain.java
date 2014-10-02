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
public class ChefAndLeftRightMain {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		ChefAndLeftRight solver = new ChefAndLeftRight();
		int testCount = Integer.parseInt(in.next());
		for (int i = 1; i <= testCount; i++)
			solver.solve(i, in, out);
		out.close();
	}
}
 
class ChefAndLeftRight {
    static int MOD = 1000000000 + 7;
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        String input = in.next();
        int len = input.length();
        long ans = input.charAt(0) == 'l' ?2:4;
        for (int i = 1;i < len;++i) {
            if ((i & 1) == 0) {
                if (input.charAt(i) == 'l')
                    ans = (ans * 2) % MOD;
                else
                    ans = (ans * 2 + 2) % MOD;
            }else {
                if (input.charAt(i) == 'l')
                    ans = (ans * 2 - 1) % MOD;
                else
                    ans = (ans * 2 + 1) % MOD;
 
            }
 
        }
        out.println(ans);
 
 
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
 
