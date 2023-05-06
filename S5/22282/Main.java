import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < n; i++ ) {
            count = n - i;
            
            if(arr[i] >= count){
                break;
            }
        }

        bw.write(Integer.toString(count));
        bw.close();
    }
}