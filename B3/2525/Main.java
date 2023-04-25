import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int h = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int s2 = Integer.parseInt(br.readLine());

        m += s2;
        while (m >= 60) {
            h++;
            m -= 60;
        }
        if (h >= 24)
            h -= 24;

        bw.write(h + " " + m);
        bw.close();
    }
}