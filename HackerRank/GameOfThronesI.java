import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by HeartCoder on 8/19/2014.
 */
public class GameOfThronesI {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream bos = new BufferedOutputStream(System.out);
        String str = br.readLine();
        int[] count = new int[26];
        Arrays.fill(count,0);
        int len = str.length();
        for(int i = 0;i < len;++i) {
            count[str.charAt(i) - 97]++;
        }
        int numberOfOddCharacters = 0;
        boolean flag = true;
        for(int j = 0;j < 26;++j) {
            if((count[j] & 1) > 0) {
                numberOfOddCharacters++;
            }
            if(numberOfOddCharacters > 1) {
                flag = false;
                break;
            }
        }
        if(flag) {
            bos.write("YES".getBytes());
            bos.write("\n".getBytes());
        }else {

            bos.write("NO".getBytes());
            bos.write("\n".getBytes());
        }

        bos.flush();
    }
}
