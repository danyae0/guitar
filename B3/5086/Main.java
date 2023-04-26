import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);

        while (x != 0 && y != 0) {
            if (y % x == 0)
                bw.write("factor");
            else if (x % y == 0)
                bw.write("multiple");
            else
                bw.write("neither");

            s = br.readLine().split(" ");

            x = Integer.parseInt(s[0]);
            y = Integer.parseInt(s[1]);
            bw.write("\n");
        }

        bw.close();
    }
}