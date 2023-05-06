import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "";
        int index = 1;

        while (!(s = br.readLine()).equals("0 0 0")) {
            String[] arr = s.split(" ");

            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);
            int z = Integer.parseInt(arr[2]);

            int sum = 0;

            if (z % y > x) {
                sum = z / y * x + x;
            } else {
                sum = z / y * x + z % y;
            }
            bw.write("Case " + index++ + ": " + Integer.toString(sum) + "\n");

        }
        bw.close();
    }
}