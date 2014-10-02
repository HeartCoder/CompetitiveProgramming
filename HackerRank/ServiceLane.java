import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by HeartCoder on 8/19/2014.
 */
public class ServiceLane {
    static int testCases,N;
    static int[] width;
    static int start,end;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream bos = new BufferedOutputStream(System.out);
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        N = new Integer(st.nextToken());
        testCases = new Integer(st.nextToken());
        str = br.readLine();
        st = new StringTokenizer(str);
        width = new int[N];
        int index = 0;
        while(st.hasMoreTokens()) {
            width[index++] = new Integer(st.nextToken());
        }
        for(int i = 1;i <= testCases;++i) {
            str = br.readLine();
            st = new StringTokenizer(str);
            start = new Integer(st.nextToken());
            end = new Integer(st.nextToken());
           int  min = Integer.MAX_VALUE;
            for(int j = start;j <= end;++j) {
                if(width[j] < min) {
                    min = width[j];
                }
            }
            bos.write(new Integer(min).toString().getBytes());
            bos.write("\n".getBytes());
        }
        bos.flush();
    }
}
