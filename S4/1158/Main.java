import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList < Integer > stk = new LinkedList < Integer > ();

        String[] s = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        for (int i = 1; i < a + 1; i++)
            stk.add(i);

        bw.write("<");

        int index = b - 1;

        while (stk.size() != 0) {
            if (stk.size() == 1) {
                bw.write(stk.get(index) + ">");
                break;
            } else {
                bw.write(stk.get(index) + ", ");
                stk.remove(index);
                index += b - 1;
                if (index == stk.size() - 1) {
                    index = stk.size() - 1;
                } else {
                    index %= stk.size();
                }

            }
        }






        bw.close();
    }
}