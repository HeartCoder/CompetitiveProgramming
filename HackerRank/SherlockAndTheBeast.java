import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by HeartCoder on 8/19/2014.
 */
public class SherlockAndTheBeast {
    static int tesCases;
    static int N;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream bos = new BufferedOutputStream(System.out);
        String str = br.readLine();
        tesCases = new Integer(str);
        for(int i = 1;i <= tesCases;++i) {
            str = br.readLine();
            N = new Integer(str);
            int five = - 1;
            int three = - 1;
            for(int j = 3;j <= N;++j) {
                if((j % 3 == 0) && ((N - j) % 5 == 0)) {
                    if(five < j) {
                        three = N - j;
                        five = j;
                    }
                }else if((j % 5 == 0) && ( (N - j) % 3 == 0)){
                    if(five < N - j) {
                        five = N - j;
                        three = j;

                    }
                }
            }
            if(five > 0 || three > 0) {
                while(five > 0) {
                    bos.write("5".getBytes());
                    five--;
                }
                while (three > 0){
                    bos.write("3".getBytes());
                    three--;
                }

            }else {
                bos.write("-1".getBytes());
            }
            bos.write("\n".getBytes());
        }

        bos.flush();
    }
}
