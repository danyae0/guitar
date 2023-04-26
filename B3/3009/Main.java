import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] x = new int[3];
        int[] y = new int[3];
        for (int i = 0; i < 3; i++) {
            String[] s = br.readLine().split(" ");
            x[i] = Integer.parseInt(s[0]);
            y[i] = Integer.parseInt(s[1]);
        }

        if (x[0] == x[1])
            bw.write(x[2] + " ");
        else if (x[0] == x[2])
            bw.write(x[1] + " ");
        else
            bw.write(x[0] + " ");

        if (y[0] == y[1])
            bw.write(y[2] + "");
        else if (y[0] == y[2])
            bw.write(y[1] + "");
        else
            bw.write(y[0] + "");

        bw.close();

    }
}