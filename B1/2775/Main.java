import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int m = 0; m < n; m++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int[][] arr = new int[a + 1][b];

            if (b == 1) bw.write("1\n");
            else {

                for (int i = 0; i < b; i++)
                    arr[0][i] = i + 1;

                for (int i = 0; i < a + 1; i++)
                    arr[i][0] = 1;

                for (int i = 1; i < a + 1; i++) {
                    for (int j = 1; j < b; j++) {
                        arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
                    }
                }
                bw.write(arr[a][b - 1] + "\n");
            }
        }

        bw.close();
    }
}