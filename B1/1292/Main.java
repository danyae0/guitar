import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int add = 0;

        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);

        double sum = (-1 + Math.pow(1 + 8 * y, 0.5)) / 2;
        int k = (int)(Math.floor(sum) * (Math.floor(sum) + 1) / 2);

        add += (y - k) * (int) Math.ceil(sum);

        for (int i = 1; i <= (int) Math.floor(sum); i++) {
            add += Math.pow(i, 2);
        }

        double sum2 = (-1 + Math.pow(1 + 8 * (x - 1), 0.5)) / 2;
        int k2 = (int)(Math.floor(sum2) * (Math.floor(sum2) + 1) / 2);

        add -= (x - k2 - 1) * (int) Math.ceil(sum2);

        for (int i = 1; i <= (int) Math.floor(sum2); i++)
            add -= Math.pow(i, 2);

        bw.write(Integer.toString(add));

        bw.close();
    }
}