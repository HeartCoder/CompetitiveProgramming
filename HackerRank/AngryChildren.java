import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by HeartCoder on 8/19/2014.
 */
public class AngryChildren {

    static int N,K;
    static int[] numbers;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream bos = new BufferedOutputStream(System.out);
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        numbers = new int[N];
        for(int i = 0;i < N;++i) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(numbers);
        int min = Integer.MAX_VALUE;
        for (int j = 0;j <= N - K ;++j) {
            if (numbers[j + K - 1] - numbers[j] < min) {
                min = numbers[j + K - 1] - numbers[j];
            }
        }
        bos.write(new Integer(min).toString().getBytes());
        bos.write("\n".getBytes());

        bos.flush();

    }


}
