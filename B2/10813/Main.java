import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        
        int m = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        
        int[] arr = new int[m];
        for(int i = 0; i < m; i++)
            arr[i] += i + 1;
        
        for(int j = 0; j < n; j++){
            s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]) - 1;
            int y = Integer.parseInt(s[1]) - 1;
            
            int tmp = arr[x];
            arr[x] = arr[y];
            arr[y] = tmp;
        }
        
        for(int k: arr)
            bw.write(k + " ");
        
        bw.close();
    }
}