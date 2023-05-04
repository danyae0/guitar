import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack < Character > stk = new Stack < Character > ();

        for (int j = 0; j < n; j++) {
            String s[] = br.readLine().split(" ");
            //C
            int index = 0;
            String base = "";
            String oppose = "";
            String result = "";

            if (s[index].equals("0")) {
                index++;
            } else {
                index++;
                base = s[index];
                index++;
            }

            if (s[index].equals("0")) {
                index++;
            } else {
                index++;
                oppose = s[index];
                index++;
            }

            int tr = Integer.parseInt(s[index]);
            result = s[++index];

            index = 0;

            for (int i = 0; i < tr; i++) {
                if (stk.empty()) {
                    stk.push(result.charAt(i));
                } else {
                    if (!base.equals("")) {
                        if (result.charAt(i) == base.charAt(0)) {
                            if (stk.peek() == base.charAt(1)) {
                                stk.pop();
                                stk.push(base.charAt(2));
                                continue;
                            }
                        } else if (result.charAt(i) == base.charAt(1)) {
                            if (stk.peek() == base.charAt(0)) {
                                stk.pop();
                                stk.push(base.charAt(2));
                                continue;
                            }
                        }
                    }
                    if (!oppose.equals("")) {
                        if (result.charAt(i) == oppose.charAt(0)) {
                            if (stk.search(oppose.charAt(1)) != -1) {
                                while (!stk.empty()) {
                                    stk.pop();
                                }
                                continue;
                            }
                        } else if (result.charAt(i) == oppose.charAt(1)) {
                            if (stk.search(oppose.charAt(0)) != -1) {
                                while (!stk.empty()) {
                                    stk.pop();
                                }
                                continue;
                            }
                        }
                    }
                    stk.push(result.charAt(i));
                }
            }

            Stack < Character > answer = new Stack < Character > ();
            while (!stk.empty()) {
                answer.push(stk.pop());
            }
            bw.write("Case #" + (j + 1) + ": [");
            while (answer.size() > 1) {
                bw.write(answer.pop() + ", ");
            }
            if (answer.size() == 0) {
                bw.write("]");
            } else {
                bw.write(answer.pop() + "]");
            }
            bw.write("\n");

        }

        bw.close();


    }
}