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
public class MatrixMain {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Matrix solver = new Matrix();
		solver.solve(1, in, out);
		out.close();
	}
}
 
class Matrix {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] mat = new int[n][n];
		for (int i = 0;i < n;++i) {
			for (int j = 0;j < n;++j) {
				mat[i][j] = in.nextInt();
			}
		}
		int angle = 0;
		for (int i = 0;i < m;++i) {
			angle = in.nextInt();
			angle /= 90;
			angle %= 4;
			if (angle == 1) {
				for (int k = 0;k < n;++k) {
					for (int j = n - 1;j >= 0;--j) {
						out.print(mat[j][k] + " ");
					}
					out.println();
				}
			}else if (angle == 2) {
				for (int k = n - 1;k >= 0;--k) {
					for (int j = n - 1;j >= 0;--j) {
						out.print(mat[k][j] + " ");
					}
					out.println();
				}
			}else if  (angle == 3) {
				for (int k = n - 1;k >= 0;--k) {
					for (int j = 0;j < n;++j) {
						out.print(mat[j][k] + " ");
					}
					out.println();
				}
			}else {
				for (int k = 0;k < n;++k) {
					for (int j = 0;j < n;++j) {
						out.print(mat[k][j] + " ");
					}
					out.println();
				}
			}
			out.println();
			
		
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
