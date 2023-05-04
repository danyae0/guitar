import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int count = 0;

        Stack < Character > lstk = new Stack < Character > ();
        Stack < Character > sstk = new Stack < Character > ();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'L') {
                lstk.push('L');
            } else if (s.charAt(i) == 'S') {
                sstk.push('S');
            } else if (s.charAt(i) == 'R') {
                if (lstk.empty()) {
                    break;
                } else {
                    lstk.pop();
                    count++;
                }
            } else if (s.charAt(i) == 'K') {
                if (sstk.empty()) {
                    break;
                } else {
                    sstk.pop();
                    count++;
                }
            } else {
                count++;
            }
        }

        bw.write(Integer.toString(count));
        bw.close();
    }
}