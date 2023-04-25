import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int z = Integer.parseInt(s[2]);

        if (x == y && y == z)
            bw.write(10000 + (x * 1000) + "");
        else if (x == y)
            bw.write(1000 + (x * 100) + "");
        else if (y == z)
            bw.write(1000 + (y * 100) + "");
        else if (x == z)
            bw.write(1000 + (z * 100) + "");
        else {
            if (x > y && x > z) {
                bw.write(x * 100 + "");
            } else if (y > z) {
                bw.write(y * 100 + "");
            } else {
                bw.write(z * 100 + "");
            }
        }

        bw.close();
    }
}