import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * Created by HeartCoder on 8/19/2014.
 */
public class Anagram {

    static int testCases;


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream bos = new BufferedOutputStream(System.out);
        testCases = Integer.parseInt(br.readLine());
        String str;
        for(int i = 1;i <= testCases;++i) {
            str = br.readLine();
            int len = str.length();

            int[] count = new int[26];
            if ((len & 1) > 0) {
               bos.write("-1".getBytes());
            }else {
                Arrays.fill(count, 0);
                for (int k = len / 2; k < len; ++k) {
                    count[str.charAt(k) - 97]++;
                }
                for (int k = 0; k < len / 2; ++k) {
                    if (count[str.charAt(k) - 97] != 0) {
                        count[str.charAt(k) - 97]--;
                    }
                }
                int ans = 0;
                for (int k = 0; k < 26; ++k) {
                    ans += count[k];
                }
                bos.write(new Integer(ans).toString().getBytes());
            }
            bos.write("\n".getBytes());

        }


        bos.flush();

    }


}
