import java.io.*;
import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        DecimalFormat df = new DecimalFormat("#.00");

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            double d = Double.parseDouble(s[0]);
            for (int j = 1; j < s.length; j++) {
                if (s[j].equals("@"))
                    d *= 3;
                else if (s[j].equals("%"))
                    d += 5;
                else
                    d -= 7;
            }
            bw.write(df.format(d) + "\n");
        }

        bw.close();
    }
}