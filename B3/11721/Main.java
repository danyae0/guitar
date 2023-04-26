import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        if (s.length() / 10 < 0)
            bw.write(s);
        else {
            for (int i = 0; i < (s.length() / 10 * 10); i += 10) {
                bw.write(s.substring(i, i + 10) + "\n");
            }
            if (s.length() % 10 != 0)
                bw.write(s.substring(s.length() / 10 * 10, s.length()));
        }

        bw.close();

    }
}