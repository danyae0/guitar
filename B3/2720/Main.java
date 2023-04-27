import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int change = Integer.parseInt(br.readLine());

            int q = change / 25;
            change -= q * 25;
            int d = change / 10;
            change -= d * 10;
            int nk = change / 5;
            change -= nk * 5;
            int p = change;

            bw.write(q + " " + d + " " + nk + " " + p + "\n");
        }
        bw.close();
    }
}