import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack < String > stk = new Stack < String > ();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            if (s.equals("A")) {
                stk.push(s);
            } else {
                if (stk.empty()) {
                    bw.write("NO");
                    break;
                } else {
                    stk.pop();
                }
            }
            if (i == n - 1 && stk.empty()) {
                bw.write("YES");
                break;
            } else if (i == n - 1 && !stk.empty()) {
                bw.write("NO");
                break;
            }
        }

        bw.close();


    }
}