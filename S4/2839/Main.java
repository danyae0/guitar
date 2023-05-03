import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int orin = n;

        int count = 0;

        if (n == 4) {
            count = -1;
        } else {
            if (orin % 5 == 0)
                count = orin / 5;
            else {
                count = orin / 5;
                n -= (orin / 5) * 5;

                while (n % 3 != 0 && n <= orin) {
                    n += 5;
                    count--;
                }

                if (n > orin) {
                    count = -1;
                } else if (n == orin) {
                    count = orin / 3;
                } else {
                    count += n / 3;
                }
            }



        }

        bw.write(Integer.toString(count));
        bw.close();
    }
}