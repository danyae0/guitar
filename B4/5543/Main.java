import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] x = new int[3];
        int minx = 2000;

        int[] y = new int[2];
        int miny = 2000;

        for (int i = 0; i < 3; i++) {
            x[i] = Integer.parseInt(br.readLine());
            if (minx > x[i])
                minx = x[i];
        }
        for (int i = 0; i < 2; i++) {
            y[i] = Integer.parseInt(br.readLine());
            if (miny > y[i])
                miny = y[i];
        }

        bw.write(minx + miny - 50 + "");

        bw.close();
    }
}