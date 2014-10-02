import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by HeartCoder on 8/19/2014.
 */
public class LoveLetterMystery {
    static int testCases;
    static int ans;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream bos = new BufferedOutputStream(System.out);
        String str = br.readLine();
        testCases = Integer.parseInt(str);
        for(int i = 1;i <= testCases;++i) {
            str = br.readLine();
            ans = 0;
            int len = str.length();
            for(int k = 0,j = len - 1;k < j;++k,--j) {
                ans = ans + Math.abs(str.charAt(k) - str.charAt(j));
            }
            bos.write(new Integer(ans).toString().getBytes());
            bos.write("\n".getBytes());
        }
        bos.flush();
    }
}
