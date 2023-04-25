import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);

        if ((x + y) % 2 != 0 || x < y)
            bw.write("-1");
        else
            bw.write((x + y) / 2 + " " + ((x + y) / 2 - y));

        bw.close();

    }
}