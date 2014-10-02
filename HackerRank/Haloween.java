import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by HeartCoder on 8/19/2014.
 */
public class Haloween {
    static int testCases;
    static long  ans,N;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream bos = new BufferedOutputStream(System.out);
        String str = br.readLine();
        testCases = new Integer(str);
        for(int i = 1;i <= testCases;++i) {
            str = br.readLine();
            N = new Long(str);
            if((N & 1) > 0) {
                ans = N / 2;
                ans *= (ans + 1);
            }else {
                ans = N / 2;
                ans *= ans;
            }

            bos.write(new Long(ans).toString().getBytes());
            bos.write("\n".getBytes());


        }

        bos.flush();
    }
}
