import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++)
                bw.write("*");
            for (int k = 0; k < (2 * n - 2 * i - 2); k++)
                bw.write(" ");
            for (int j = 0; j < i + 1; j++)
                bw.write("*");
            bw.write("\n");
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                bw.write("*");
            for (int k = 0; k < 2 * i + 2; k++)
                bw.write(" ");
            for (int j = 0; j < n - i - 1; j++)
                bw.write("*");
            bw.write("\n");
        }

        bw.close();
    }
}