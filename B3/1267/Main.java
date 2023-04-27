import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum1 += (Integer.parseInt(s[i]) / 30 + 1) * 10;
            sum2 += (Integer.parseInt(s[i]) / 60 + 1) * 15;
        }

        if (sum1 > sum2)
            bw.write("M " + sum2);
        else if (sum1 < sum2)
            bw.write("Y " + sum1);
        else bw.write("Y M " + sum1);


        bw.close();
    }
}