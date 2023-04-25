import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            String[] s = br.readLine().split(" ");
            int x = 0;
            int y = 0;
            int z = 0;

            if (Integer.parseInt(s[5]) - Integer.parseInt(s[2]) < 0) {
                y--;
                z = 60 + Integer.parseInt(s[5]) - Integer.parseInt(s[2]);
            } else {
                z = Integer.parseInt(s[5]) - Integer.parseInt(s[2]);
            }
            if (Integer.parseInt(s[4]) - Integer.parseInt(s[1]) < 0) {
                x--;
                y += 60 + Integer.parseInt(s[4]) - Integer.parseInt(s[1]);
            } else {
                y += Integer.parseInt(s[4]) - Integer.parseInt(s[1]);
                if (y < 0) {
                    x--;
                    y += 60;
                }
            }
            x += Integer.parseInt(s[3]) - Integer.parseInt(s[0]);
            bw.write(x + " " + y + " " + z + "\n");
        }
        bw.close();
    }
}