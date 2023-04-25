import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++)
            arr[i] = Integer.parseInt(s[i]);

        Arrays.sort(arr);

        bw.write(arr[1] + "");
        bw.close();
    }
}