import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.InputStream;
import java.util.StringTokenizer;
 
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author HeartCoder
 */
public class WhoGetsHerMain {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		WhoGetsHer solver = new WhoGetsHer();
		int testCases = in.nextInt();
		for (int t = 1;t <= testCases;++t)
			solver.solve(t, in, out);
		out.close();
	}
}
 
class WhoGetsHer {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
		int t = in.nextInt();
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] mat = new int[n][m];
		for (int i = 0;i < n;++i) {
			for (int j = 0;j < m;++j) {
				mat[i][j] = in.nextInt();
			}
		}
		int totalTime = 0;
		for (int i = n - 2;i >= 0;--i) {
			for (int j = 0;j < m;++j) {
				if (j == 0) {
					mat[i][j] += Math.min(mat[i + 1][j],mat[i + 1][j + 1]);
				}else if (j == m - 1) {
					mat[i][j] += Math.min(mat[i + 1][j],mat[i + 1][j - 1]);
				}else {
					mat[i][j] += Math.min(Math.min(mat[i + 1][j],mat[i + 1][j - 1]),mat[i + 1][j + 1]);
				}
			}
		}
		boolean ans = false;
		for (int i = 0;i < m;++i) {
			if (mat[0][i] < t) {
				ans = true;
				break;
			}
		}
		
		if (ans) {
			out.println("YES");
		}else {
			out.println("NO");
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
