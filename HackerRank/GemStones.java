import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by HeartCoder on 8/19/2014.
 */
public class GemStones {
    static int testCases;
    static int ans;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream bos = new BufferedOutputStream(System.out);
        String str = br.readLine();
        testCases = new Integer(str);
        int len;
        int[] count = new  int[26];
        Arrays.fill(count,0);
        for(int i = 1;i <= testCases;++i) {
            str = br.readLine();
            len = str.length();
            boolean flag[] = new boolean[26];
            Arrays.fill(flag,false);
            for(int j = 0;j < len;++j) {
                if(!flag[str.charAt(j) - 97] )
                count[str.charAt(j) - 97]++;
                flag[str.charAt(j) - 97] = true;
            }
        }
        ans = 0;
        for(int k = 0;k < 26;++k) {
            if(count[k] >= testCases) {
                ans++;
            }
        }
        bos.write(new Integer(ans).toString().getBytes());
        bos.write("\n".getBytes());
        bos.flush();
    }
}
