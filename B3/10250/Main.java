import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            int z = Integer.parseInt(s[2]);

            int rem = (z % x);
            if (rem == 0)
                rem = x;

            if (z / x < 9) {
                if (z % x == 0)
                    bw.write(rem + "0" + z / x + "\n");
                else
                    bw.write(rem + "0" + (z / x + 1) + "\n");
            } else {

                if (z % x == 0) {
                    if (z / x == 9)
                        bw.write(rem + "0" + z / x + "\n");
                    else
                        bw.write(rem + "" + z / x + "\n");
                } else
                    bw.write(rem + "" + (z / x + 1) + "\n");
            }
        }
        bw.close();
    }
}