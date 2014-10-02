import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by HeartCoder on 8/19/2014.
 */
public class MaximizingXOR {
    static int left,right;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream bos = new BufferedOutputStream(System.out);
        String str = br.readLine();
        left = new Integer(str);
        str = br.readLine();
        right = new Integer(str);
        int max = Integer.MIN_VALUE;
        for(int i = left;i < right;++i) {
            for(int j = i + 1;j <= right;++j) {
                if((i ^ j) > max) {
                    max = i ^ j;
                }
            }
        }
        if(left == right) {
            bos.write(new Integer(left ^ right).toString().getBytes());
            bos.write("\n".getBytes());
        }else {

            bos.write(new Integer(max).toString().getBytes());
            bos.write("\n".getBytes());
        }
        bos.flush();
    }
}
