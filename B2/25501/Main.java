import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static String recursion(String s, int l, int r, int k) {
        k++;
        if (l >= r) return "1 " + Integer.toString(k) + "\n";
        else if (s.charAt(l) != s.charAt(r)) return "0 " + Integer.toString(k) + "\n";
        else return recursion(s, l + 1, r - 1, k);
    }
    public static String isPalindrome(String s) {
        int count = 0;
        return recursion(s, 0, s.length() - 1, count);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            bw.write(isPalindrome(br.readLine()));
        }

        bw.close();
    }
}