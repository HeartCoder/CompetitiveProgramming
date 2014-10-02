import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
 
public class Test {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int number = Integer.parseInt(in.readLine());
		while(number != 42) {
			out.println(number);
			number = Integer.parseInt(in.readLine());
			
		}
		out.close();
	}
} 
