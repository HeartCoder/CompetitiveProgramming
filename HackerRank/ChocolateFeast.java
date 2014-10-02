import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by HeartCoder on 8/19/2014.
 */
public class ChocolateFeast {
    static int tesCases;
    static long N,C,M;
    static long ans;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream bos = new BufferedOutputStream(System.out);
        String str = br.readLine();
        tesCases = new Integer(str);
        StringTokenizer st;
        for(int i = 1;i <= tesCases;++i) {
            str = br.readLine();
            st = new StringTokenizer(str);
            N = new Integer(st.nextToken());
            C = new Integer(st.nextToken());
            M = new Integer(st.nextToken());
            ans = N / C;
            long temp = ans;
            long rem;
            while(temp >= M) {
                rem = temp % M;
                temp = temp / M;
                ans = ans + temp;
                temp = temp + rem;
            }
            bos.write(new Long(ans).toString().getBytes());
            bos.write("\n".getBytes());
        }

        bos.flush();
    }
}
