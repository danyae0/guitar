import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = n; i <= m; i++) {
            if (i == 1) {} else {
                int gcd = 1;
                int count = 2;
                while (count != i) {
                    if (i % count == 0) {
                        gcd = count;
                        break;
                    }
                    count++;
                }
                if (gcd == 1) {
                    sum += i;
                    if (min > i)
                        min = i;
                }
            }
        }

        if (sum == 0)
            bw.write("-1");
        else
            bw.write(sum + "\n" + min);

        bw.close();
    }
}