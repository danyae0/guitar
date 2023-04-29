import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");

        int x = Integer.parseInt(s2[0]);
        int y = Integer.parseInt(s2[1]);

        long result = n;
        int a = 0;

        for (int i = 0; i < n; i++) {
            a = Integer.parseInt(s[i]);
            a -= x;
            if (a <= 0) {} else {
                result += Math.ceil((double) a / y);
            }
        }

        bw.write(result + "");
        bw.close();
    }
}