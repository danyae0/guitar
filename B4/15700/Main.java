import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        long x = Long.parseLong(s[0]);
        long y = Long.parseLong(s[1]);

        bw.write(x * y / 2 + "");
        bw.close();
    }
}