import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by HeartCoder on 8/19/2014.
 */
public class ManasaAndStones {
    static int tesCases;
    static long ans;
    static int N,A,B;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream bos = new BufferedOutputStream(System.out);
        String str = br.readLine();
        tesCases = new Integer(str);
        for(int i = 1;i <= tesCases;++i) {
            str = br.readLine();
            N = new Integer(str);
            A = new Integer(str = br.readLine());
            B = new Integer(str = br.readLine());
            long indexA = N -1;
            long indexB = 0;
            if(A == B) {

                bos.write(new Long(indexA * A).toString().getBytes());
                bos.write(" ".getBytes());
            }else {
                long[] ans = new long[N];
                for (int j = 0; j < N; ++j) {
                    ans[j] = A * (indexA--) + B * (indexB++);

                }
                Arrays.sort(ans);
                for(int k = 0;k < N;++k) {

                    bos.write(new Long(ans[k]).toString().getBytes());
                    bos.write(" ".getBytes());
                }
            }


            bos.write("\n".getBytes());
        }

        bos.flush();
    }
}
