import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by HeartCoder on 8/18/2014.
 */
public class Solution {
    static int testCases;
    static int N;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream bos = new BufferedOutputStream(System.out);
        String str = br.readLine();
        testCases = Integer.parseInt(str);
        for(int i = 1;i <= testCases;++i) {
            str = br.readLine();
            N = Integer.parseInt(str);
            int ans = 1;
            for(int j = 1;j <= N;++j) {
                if((j & 1) != 0) {
                    ans *= 2;
                }else{
                    ans += 1;
                }
            }
            bos.write(new Integer(ans).toString().getBytes());
            bos.write("\n".getBytes());
        }
        bos.flush();
    }
}
