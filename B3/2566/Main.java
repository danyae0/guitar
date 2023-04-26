import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;

        for (int i = 0; i < 9; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < s.length; j++) {
                if (Integer.parseInt(s[j]) > max) {
                    x = i + 1;
                    y = j + 1;
                    max = Integer.parseInt(s[j]);
                }
            }
        }

        bw.write(max + "\n" + x + " " + y);
        bw.close();
    }
}