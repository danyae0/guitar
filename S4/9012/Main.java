import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack < Integer > stk = new Stack < Integer > ();
            String s = br.readLine();

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(') {
                    stk.push(1);
                } else {
                    if (stk.empty()) {
                        bw.write("NO");
                        break;
                    } else {
                        stk.pop();
                    }
                }
                if (j == s.length() - 1) {
                    if (stk.empty()) {
                        bw.write("YES");
                    } else {
                        bw.write("NO");
                    }
                }
            }
            bw.write("\n");
        }
        bw.close();
    }
}