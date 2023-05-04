import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack < String > stk = new Stack < String > ();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            bw.write("Case #" + (i + 1) + ": ");
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < s.length; j++)
                stk.push(s[j]);
            while (!stk.empty()) {
                bw.write(stk.pop() + " ");
            }
            bw.write("\n");
        }


        bw.close();
    }
}