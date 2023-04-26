import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++)
                bw.write(" ");
            bw.write("*");
            if (i >= 1) {
                for (int k = 0; k < 2 * i - 1; k++)
                    bw.write(" ");
                bw.write("*");
            }
            bw.write("\n");
        }
        for (int i = 0; i < 2 * n - 1; i++)
            bw.write("*");
        bw.close();
    }
}