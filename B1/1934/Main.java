import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int realx = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            int tmp = 0;


            if (x < y) {
                tmp = x;
                x = y;
                realx = y;
                y = tmp;
            }

            int gcd = y;

            if (x == 1) {
                gcd = 1;
            } else if (y % x == 0) {
                gcd = x;
            } else {
                while (true) {
                    if (x % gcd == 0)
                        break;
                    else{
                        tmp = gcd;
                        gcd = x % gcd;         
                        x = tmp;
                    }
                }
            }
            bw.write(Integer.toString(realx * y / gcd) + "\n");
        }
        bw.close();
    }
}