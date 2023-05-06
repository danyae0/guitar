import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            sum += n;
            if (sum == 100)
                break;
            else if (sum > 100) {
                if (sum - 100 <= 100 - sum + n) {
                    bw.write(Integer.toString(sum));
                    sum = Integer.MAX_VALUE;
                    break;
                } else {
                    bw.write(Integer.toString(sum - n));
                    sum = Integer.MAX_VALUE;
                    break;
                }
            }
        }

        if (sum <= 100)
            bw.write(Integer.toString(sum));

        bw.close();
    }
}