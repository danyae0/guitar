import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int count = 0;
        int gcd = 1;
        int index = 1;

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(s[i]) == 1) {
                continue;
            } else {
                while (index != Integer.parseInt(s[i])) {
                    if (Integer.parseInt(s[i]) % index == 0) {
                        gcd = index;
                        index++;
                    } else {
                        index++;
                    }
                }
                if (gcd == 1) {
                    count++;
                    gcd = 1;
                    index = 1;
                } else {
                    gcd = 1;
                    index = 1;
                }
            }
        }

        bw.write(count + "");
        bw.close();
    }
}