import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        int[] arr1 = new int[6];
        int[] arr2 = new int[6];

        for (int i = 0; i < n; i++) {
            String[] s2 = br.readLine().split(" ");
            if (s2[0].equals("0"))
                arr1[Integer.parseInt(s2[1]) - 1]++;
            else
                arr2[Integer.parseInt(s2[1]) - 1]++;
        }

        int sum = 0;

        for (int i = 0; i < 6; i++) {
            if (arr1[i] % k != 0)
                sum += arr1[i] / k + 1;
            else
                sum += arr1[i] / k;
            if (arr2[i] % k != 0)
                sum += arr2[i] / k + 1;
            else
                sum += arr2[i] / k;
        }

        bw.write(sum + "");
        bw.close();
    }
}