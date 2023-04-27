import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");

            if (Long.parseLong(s[1]) - Long.parseLong(s[2]) > Long.parseLong(s[0]))
                bw.write("advertise");
            else if (Long.parseLong(s[1]) - Long.parseLong(s[2]) == Long.parseLong(s[0]))
                bw.write("does not matter");
            else
                bw.write("do not advertise");
            bw.write("\n");
        }

        bw.close();
    }
}