import java.io.*;
import java.util.*;

public class CutTheSticks {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(in.readLine());
        StringTokenizer tokenizer = new StringTokenizer(in.readLine());
        int[] count = new int[1001];
        int[] numbers = new int[n];
        int index = 0;
        int temp = 0;
        while (tokenizer.hasMoreTokens()) {
            
            temp = Integer.parseInt(tokenizer.nextToken());
            if (count[temp] == 0)
                numbers[index++] = temp;
            count[temp]++;
        }
        Arrays.sort(numbers,0,index);
        for (int i = 0;i < index;++i) {
            out.println(n);
            n -= count[numbers[i]];
            
        }
        out.close();
    
        
        
        
        
    }
}
