import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack < Character > stk = new Stack < Character > ();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < Integer.parseInt(s[0]); j++) {
                if (s[1].charAt(j) == '>')
                    stk.push('>');
                else {
                    if (stk.empty()) {
                        stk.push('<');
                        break;
                    } else {
                        if (stk.peek() != '>')
                            break;
                        else
                            stk.pop();
                    }
                }
            }
            if (stk.empty()) {
                bw.write("legal\n");
            } else {
                bw.write("illegal\n");
            }
            while (!stk.empty())
                stk.pop();
        }

        bw.close();
    }
}