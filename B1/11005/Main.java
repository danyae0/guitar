import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        String ans = "";

        while (x > 0) {
            if (x % y >= 10) {
                ans += Character.toString((char)(x % y + 55));
                x /= y;
            } else {
                ans += Integer.toString(x % y);
                x /= y;
            }
        }

        bw.write(new StringBuffer(ans).reverse().toString());

        bw.close();
    }
}