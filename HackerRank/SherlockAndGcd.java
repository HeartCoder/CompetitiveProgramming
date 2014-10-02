import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by HeartCoder on 8/19/2014.
 */
public class SherlockAndGcd {
    static int testCase;
    static int N;
    static int[] numbers;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream bos = new BufferedOutputStream(System.out);
        String str = br.readLine();
        testCase = new Integer(str);
        StringTokenizer st;
        for(int i = 1;i <= testCase;++i) {
            N = Integer.parseInt(str = br.readLine());
            numbers = new int[N];
            str = br.readLine();
            st = new StringTokenizer(str);
            for(int j = 0;j < N;++j) {
                numbers[j] = Integer.parseInt(st.nextToken());
            }
            boolean flag = false;
            for (int k = 0;k < N - 1;++k) {
                for (int m = k + 1;m < N;++m) {
                    if(gcd(numbers[k],numbers[m]) == 1) {
                        flag = true;
                        bos.write("YES".getBytes());
                        break;
                    }

                }
                if (flag) {
                    break;
                }
            }
            if(!flag) {
                bos.write("NO".getBytes());

            }
            bos.write("\n".getBytes());


        }

        bos.flush();
    }

    public static int gcd(int a,int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b,a % b);
    }
}
