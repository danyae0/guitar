import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack < Character > stk = new Stack < Character > ();
        String s = "";

        while (!(s = br.readLine()).equals("#")) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(' || s.charAt(j) == '[' || s.charAt(j) == '{')
                    stk.push(s.charAt(j));
                else if (s.charAt(j) == ')') {
                    if (stk.empty()) {
                        stk.push(')');
                        break;
                    } else {
                        if (stk.peek() != '(') {
                            break;
                        } else {
                            stk.pop();
                        }
                    }
                } else if (s.charAt(j) == ']') {
                    if (stk.empty()) {
                        stk.push(']');
                        break;
                    } else {
                        if (stk.peek() != '[') {
                            break;
                        } else {
                            stk.pop();
                        }
                    }
                } else if (s.charAt(j) == '}') {
                    if (stk.empty()) {
                        stk.push('}');
                        break;
                    } else {
                        if (stk.peek() != '{') {
                            break;
                        } else {
                            stk.pop();
                        }
                    }
                }
            }
            if (stk.empty()) {
                bw.write("Legal\n");
            } else {
                bw.write("Illegal\n");
            }

            while (!stk.empty())
                stk.pop();
        }

        bw.close();
    }
}