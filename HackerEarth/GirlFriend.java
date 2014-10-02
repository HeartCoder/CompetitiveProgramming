import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Created by HeartCoder on 10/1/2014.
 */
public class GirlFriend {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String demand = in.readLine();
        StringTokenizer tokenizer;
        int q = Integer.parseInt(in.readLine());
        long a = 0;
        long b = 0;
        int actualA = 0;
        int actualB = 0;
        int len = demand.length();
        for (int i = 0;i < q;++i) {
            tokenizer = new StringTokenizer(in.readLine());
            a = Long.parseLong(tokenizer.nextToken());
            b = Long.parseLong(tokenizer.nextToken());
            actualA = (int)(a % len);
            actualB = (int)(b % len);
            if (actualA == 0) {
                actualA = len;
            }
            if (actualB == 0) {
                actualB = len;
            }

            if (demand.charAt(actualA - 1) == demand.charAt(actualB - 1)) {
                out.println("Yes");
            }else {
                out.println("No");
            }
        }
        out.close();
    }
}
