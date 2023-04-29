import java.io.*;
import java.util.*;

public class Main {

    public static int square(int n) {
        int index = 1;
        
        if(n == 1)
            return 1;

        while (index < n) {
            if (index * index == n)
                return n;
            else index++;
        }

        return 0;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = M; i <= N; i++) {
            if (square(i) == 0) {} else {
                sum += i;
                if (min > sum) min = sum;
            }
        }
        if (min == Integer.MAX_VALUE) {
            bw.write("-1");
            bw.close();
        } else {
            bw.write(sum + "\n" + min);
            bw.close();
        }

    }
}