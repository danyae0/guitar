import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = 0;
        int max = 0;

        for (int i = 0; i < 4; i++) {
            String[] s = br.readLine().split(" ");
            total += Integer.parseInt(s[1]);
            total -= Integer.parseInt(s[0]);

            if (max < total)
                max = total;
        }

        bw.write(max + "");
        bw.close();
    }
}