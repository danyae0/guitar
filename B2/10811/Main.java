import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static int[] swap(int[] arr, int x, int y) {
        int tmp = 0;
        if (x == y) {
            return arr;
        } else {
            while (x < y) {
                tmp = arr[x];
                arr[x] = arr[y];
                arr[y] = tmp;
                x++;
                y--;
            }
            return arr;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] += 1 + i;

        for (int i = 0; i < b; i++) {
            String[] s2 = br.readLine().split(" ");
            arr = swap(arr, Integer.parseInt(s2[0]) - 1, Integer.parseInt(s2[1]) - 1);
        }

        for (int i: arr)
            bw.write(i + " ");

        bw.close();
    }
}