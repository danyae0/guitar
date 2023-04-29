import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]) % 10;
            int y = Integer.parseInt(s[1]);
            int result = 0;

            if (x == 1 || x == 5 || n == 6) {
                result = x;
            } else if (x == 2 || x == 3 || x == 7 || x == 8) {
                if (y % 4 == 0)
                    result = (int) Math.pow(x, 4) % 10;
                else result = (int) Math.pow(x, y % 4) % 10;
            } else if (x == 0) {
                result = 10;
            } else {
                if (y % 2 == 0)
                    result = (int) Math.pow(x, 2) % 10;
                else result = x;
            }
            bw.write(result + "\n");
        }
        bw.close();
    }
}