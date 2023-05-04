import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack < Long > stk = new Stack < Long > ();

        for (int i = 0; i < n; i++) {
            long add = Long.parseLong(br.readLine());
            if (add == 0)
                stk.pop();
            else
                stk.push(add);
        }

        long sum = 0;

        while (!stk.empty())
            sum += (stk.pop());

        bw.write(Long.toString(sum));
        bw.close();
    }
}