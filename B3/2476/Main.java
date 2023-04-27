import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            int z = Integer.parseInt(s[2]);

            if (x == y && x == z)
                sum = 10000 + x * 1000;
            else if (x == y)
                sum = 1000 + x * 100;
            else if (y == z)
                sum = 1000 + y * 100;
            else if (x == z)
                sum = 1000 + z * 100;
            else {
                if (x > y && x > z)
                    sum = x * 100;
                else if (y > z && y > x)
                    sum = y * 100;
                else sum = z * 100;
            }

            if (max < sum) max = sum;
        }

        bw.write(max + "");
        bw.close();
    }
}