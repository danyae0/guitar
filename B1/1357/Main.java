import java.io.*;
import java.util.*;

public class Main {
    public static int rev(String s) {
        String ss = new StringBuffer(s).reverse().toString();

        int index = 0;

        while (ss.charAt(index) == '0') {
            index++;
        }

        ss = ss.substring(index, ss.length());

        return Integer.parseInt(ss);
    }


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        bw.write(Integer.toString(rev(Integer.toString(rev(s[0]) + rev(s[1])))));
        bw.close();
    }
}