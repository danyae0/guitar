import java.io.*;
import java.util.*;

public class Main {

    public int[] swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;

        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int[] arr = new int[n];
        int[] newarr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            newarr[i] = i + 1;
        }

        for (int i = 0; i < b; i++) {
            s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            int z = Integer.parseInt(s[2]);

            for (int j = 0; j < y - z + 1; j++) {
                newarr[x + j - 1] = arr[j + z - 1];
            }
            for (int j = 0; j < z - x; j++) {
                newarr[x + y - z + j] = arr[j + x - 1];
            }
            for (int as = 0; as < n; as++)
                arr[as] = newarr[as];
        }


        for (int i: newarr)
            bw.write(Integer.toString(i) + " ");

        bw.close();

    }
}