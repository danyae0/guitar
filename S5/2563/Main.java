import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[100][100];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (arr[k][j] == 0)
                        arr[k][j]++;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
        }

        bw.write(Integer.toString(count));
        bw.close();
    }
}