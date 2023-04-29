import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int max = Integer.MIN_VALUE;

        String[] s2 = br.readLine().split(" ");

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int l = j + 1; l < n; l++) {
                    if (Integer.parseInt(s2[i]) + Integer.parseInt(s2[j]) + Integer.parseInt(s2[l]) <= k) {
                        if (max < Integer.parseInt(s2[i]) + Integer.parseInt(s2[j]) + Integer.parseInt(s2[l]))
                            max = Integer.parseInt(s2[i]) + Integer.parseInt(s2[j]) + Integer.parseInt(s2[l]);
                    }
                }
            }
        }
        bw.write(max + "");
        bw.close();
    }
}