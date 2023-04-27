import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            String[] s = br.readLine().split(" ");

            sum -= Integer.parseInt(s[0]);
            sum += Integer.parseInt(s[1]);

            if (max < sum) max = sum;
        }

        bw.write(max + "");
        bw.close();
    }
}