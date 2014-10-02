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
public class TwoArrays {

    static int N,K,testCases;
    static int[] A ,B;


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream bos = new BufferedOutputStream(System.out);
        testCases = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 1;i <= testCases;++i) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            A = new int[N];
            B = new int[N];
            for (int k = 0;k < N;++k) {
                A[k] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int k = 0;k < N;++k) {
                B[k] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(A);
            Arrays.sort(B);
            boolean flag = true;
            int k = 0,m = N - 1;
            while(k < N && m >= 0){
                    if(A[k++] + B[m--] < K) {
                        flag = false;
                        break;
                    }

            }
            if (flag){
                bos.write("YES".getBytes());

            }else {
                bos.write("NO".getBytes());
            }
            bos.write("\n".getBytes());

        }


        bos.flush();

    }


}
