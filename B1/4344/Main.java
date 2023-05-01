import java.io.*;
import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        DecimalFormat df = new DecimalFormat("0.000");

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            double k = Double.parseDouble(s[0]);
            double sum = 0;
            for (int j = 1; j <= k; j++) {
                sum += Double.parseDouble(s[j]);
            }
            sum /= k;
            int count = 0;
            for(int asd = 1; asd <= k; asd ++)
                if(Double.parseDouble(s[asd]) > sum)
                    count++;
            
            bw.write(df.format(count / k * 100.0) + "%\n");
        }

        bw.close();
    }
}