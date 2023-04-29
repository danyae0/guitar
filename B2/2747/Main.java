import java.io.*;
import java.util.*;

public class Main {

    public static int fibonacci(int n, int[] arr) {
        if (n == 1 || n == 2)
            return 1;
        else if (arr[n] != 0)
            return arr[n];
        else
            arr[n] = fibonacci(n - 1, arr) + fibonacci(n - 2, arr);

        return arr[n];
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];

        bw.write(fibonacci(n, arr) + "");
        bw.close();

    }
}