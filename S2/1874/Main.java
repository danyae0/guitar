import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack < Integer > stk = new Stack < Integer > ();
        LinkedList < Character > q = new LinkedList < Character > ();
        int count = 1;
        boolean no = true;

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());

            while (target >= count) {
                stk.push(count);
                count++;
                q.push('+');
            }

            if (stk.peek() == target) {
                stk.pop();
                q.push('-');
            } else {
                no = false;
                break;
            }
        }

        if (no) {
            while (q.peek() != null) {
                bw.write(q.removeLast() + "\n");
            }
        } else {
            bw.write("NO");
        }


        bw.close();
    }
}