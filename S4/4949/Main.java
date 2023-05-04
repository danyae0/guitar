import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "";

        Stack < Character > stk = new Stack < Character > ();

        while (!(s = br.readLine()).equals(".")) {

            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '[')
                    stk.push(s.charAt(i));
                else if (s.charAt(i) == ')') {
                    if (stk.empty() || stk.peek() != '(') {
                        stk.push('(');
                        break;
                    } else {
                        if (stk.peek() == '(')
                            stk.pop();
                    }
                } else if (s.charAt(i) == ']') {
                    if (stk.empty() || stk.peek() != '[') {
                        stk.push('[');
                        break;
                    } else {
                        if (stk.peek() == '[')
                            stk.pop();
                    }
                }
            }

            if (!stk.empty()) {
                bw.write("no");
            } else {
                bw.write("yes");
            }

            while (!stk.empty()) {
                stk.pop();
            }
            bw.write("\n");
        }

        bw.close();
    }
}