import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack < Integer > stk = new Stack < Integer > ();
        Stack < Integer > answer = new Stack < Integer > ();
        int[] arr = new int[1000000];

        int n = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(s[i]) - 1]++;
        }

        answer.push(-1);
        stk.push(Integer.parseInt(s[n - 1]));

        for (int i = n - 2; i >= 0; i--) {
            while (!stk.empty()) {
                if (arr[stk.peek() - 1] > arr[Integer.parseInt(s[i]) - 1]) {
                    answer.push(stk.peek());
                    stk.push(Integer.parseInt(s[i]));
                    break;
                } else {
                    stk.pop();
                }
                if (stk.empty()) {
                    answer.push(-1);
                    stk.push(Integer.parseInt(s[i]));
                    break;
                }
            }
        }

        while (!answer.empty()) {
            bw.write(answer.pop() + " ");
        }


        bw.close();
    }
}