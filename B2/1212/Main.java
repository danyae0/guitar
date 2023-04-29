import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = {
            "000",
            "001",
            "010",
            "011",
            "100",
            "101",
            "110",
            "111"
        };
        String s = br.readLine();
        boolean negative = false;

        if (s.equals("0")) {
            bw.write("0");
            bw.close();
        } else {
            if (s.substring(0, 1).equals("-")) {
                bw.write("-");
                s = s.substring(1, s.length());
            }
            int index = 0;
            while (s.charAt(index) == '0') {
                s = s.substring(index + 1, s.length());
            }
            for (int i = 0; i < s.length(); i++) {
                if (i == 0) {
                    if (Integer.parseInt(s.substring(i, i + 1)) == 1) {
                        bw.write("1");
                    } else if (Integer.parseInt(s.substring(i, i + 1)) <= 3) {
                        bw.write(arr[Integer.parseInt(s.substring(i, i + 1))].substring(1, 3));
                    } else {
                        bw.write(arr[Integer.parseInt(s.substring(i, i + 1))]);
                    }
                } else {
                    bw.write(arr[Integer.parseInt(s.substring(i, i + 1))]);
                }
            }
            bw.close();
        }
    }
}