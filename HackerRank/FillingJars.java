import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by HeartCoder on 8/19/2014.
 */
public class FillingJars {
    static long ans;
    static long N,A,B,K,M;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream bos = new BufferedOutputStream(System.out);
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        N = new Long(st.nextToken());
        ans = 0;
        M = new Long(st.nextToken());
        for(int i = 1;i <= M;++i) {
            str = br.readLine();
            st = new StringTokenizer(str);
            A = new Long(st.nextToken());
            B = new Long(st.nextToken());
            K = new Long(st.nextToken());
            ans = ans + (B - A + 1) * K;

        }
        ans = ans / N;
        bos.write(new Long(ans).toString().getBytes());
        bos.write("\n".getBytes());

        bos.flush();
    }
}
