import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr1 = new int[4];
        int sum1 = 0;
        int min1 = 101;

        for (int i = 0; i < 4; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
            sum1 += arr1[i];
            if (min1 > arr1[i])
                min1 = arr1[i];
        }

        int[] arr2 = new int[2];
        int sum2 = 0;
        int min2 = 101;

        for (int i = 0; i < 2; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
            sum2 += arr2[i];
            if (min2 > arr2[i])
                min2 = arr2[i];
        }

        bw.write(sum1 + sum2 - min1 - min2 + "");
        bw.close();

    }
}