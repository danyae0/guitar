import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);

        String[] s1 = br.readLine().split(" ");
        int[] arr = new int[x];
        for (int i = 0; i < x; i++)
            arr[i] = Integer.parseInt(s1[i]);

        Arrays.sort(arr);

        bw.write(arr[arr.length - y] + "");
        bw.close();
    }
}