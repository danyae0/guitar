import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            int[] arr = new int[k];

            for (int j = 0; j < k; j++) {
                for (int l = j; l < k; l += j + 1) {
                    if (arr[l] == 0)
                        arr[l]++;
                    else
                        arr[l]--;
                }
            }
            int count = 0;

            for (int m: arr)
                if (m != 0)
                    count++;
            bw.write(Integer.toString(count) + "\n");
        }
        bw.close();
    }
}