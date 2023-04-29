import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int[] arr = new int[9];
        int dex1 = 0;
        int dex2 = 0;
        int n = 0;

        for (int i = 0; i < 9; i++) {
            n = Integer.parseInt(br.readLine());
            arr[i] = n;
            sum += n;
        }

        for (int j = 0; j < 8; j++) {
            for (int k = j + 1; k < 9; k++) {
                if (sum - arr[j] - arr[k] == 100) {
                    dex1 = j;
                    dex2 = k;
                    break;
                }
            }
        }

        for (int l = 0; l < 9; l++)
            if (l != dex1 && l != dex2)
                bw.write(arr[l] + "\n");

        bw.close();
    }
}