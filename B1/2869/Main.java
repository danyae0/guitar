import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int z = Integer.parseInt(s[2]);

        int count = 0;
        int sub = x - y;

        if (z <= x) {
            bw.write("1");
        } else if ((z - x) / sub == 0) {
            bw.write("2");
        } else {
            if ((z - x) % sub != 0) {
                count = ((z - x) / sub) + 2;
            } else {
                count = ((z - x) / sub) + 1;
            }

            bw.write(Integer.toString(count));
        }

        bw.close();
    }
}