import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 7; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n % 2 != 0) {
                sum += n;
                if (min > n)
                    min = n;
            }

        }
        if (sum == 0)
            bw.write("-1");
        else
            bw.write(sum + "\n" + min);

        bw.close();
    }
}