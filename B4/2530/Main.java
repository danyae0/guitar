import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        int H = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int S = Integer.parseInt(s[2]);

        int x = Integer.parseInt(br.readLine());
        S += x;

        if (S >= 60) {
            M += S / 60;
            S %= 60;
        }
        if (M >= 60) {
            H += M / 60;
            M %= 60;
        }
        if (H > 23) {
            while (H > 23) {
                H -= 24;
            }
        }
        bw.write(H + " " + M + " " + S);
        bw.close();
    }
}