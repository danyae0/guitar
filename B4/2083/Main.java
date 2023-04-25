import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        while (!s[0].equals("#")) {
            int x = Integer.parseInt(s[1]);
            int y = Integer.parseInt(s[2]);

            if (x > 17 || y >= 80)
                bw.write(s[0] + " Senior\n");
            else
                bw.write(s[0] + " Junior\n");

            s = br.readLine().split(" ");
        }
        bw.close();
    }
}