import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by HeartCoder on 8/19/2014.
 */
public class FindDigits {
    static int tesCases;
    static int ans;
    static long N;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream bos = new BufferedOutputStream(System.out);
        String str = br.readLine();
        tesCases = new Integer(str);
        for(int i = 1;i <= tesCases;++i) {
            ans = 0;
            str = br.readLine();
            N = new Long(str);
            int len = str.length();
            for(int j = 0;j < len;++j) {
                if( str.charAt(j) != 48 && N % (str.charAt(j) - 48) == 0){
                    ans++;
                }
            }


            bos.write(new Integer(ans).toString().getBytes());
            bos.write("\n".getBytes());
        }

        bos.flush();
    }
}
