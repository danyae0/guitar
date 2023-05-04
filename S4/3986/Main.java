import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack < Character > stk = new Stack < Character > ();

        int n = Integer.parseInt(br.readLine());
        int count = 0;


        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (s.length() % 2 == 1) {
                    stk.push('r');
                    break;
                } else {
                    if (stk.empty()) {
                        stk.push(s.charAt(j));
                    } else {
                        if (stk.peek() == s.charAt(j)) {
                            stk.pop();
                        } else {
                            stk.push(s.charAt(j));
                        }
                    }
                }
            }


            if (stk.empty()) {
                count++;
            }

            while (!stk.empty()) {
                stk.pop();
            }
        }

        bw.write(Integer.toString(count));
        bw.close();
    }
}