import java.io.*;
import java.util.*;

public class Main {
    public static int solve(String[] arr) {
        int[] arr2 = new int[arr.length];
        for(int i = 0; i < arr2.length; i++)
            arr2[i] = Integer.parseInt(arr[i]);
        
        Arrays.sort(arr2);
        
        return arr2[7];
        
    }


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String[] s = br.readLine().split(" ");
            
            bw.write(solve(s) + "\n");
        }

        bw.close();
    }
}