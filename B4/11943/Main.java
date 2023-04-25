import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);

        String[] s2 = br.readLine().split(" ");
        int x2 = Integer.parseInt(s2[0]);
        int y2 = Integer.parseInt(s2[1]);

        if (x + y2 >= y + x2)
            bw.write(y + x2 + "");
        else
            bw.write(x + y2 + "");

        bw.close();

    }
}