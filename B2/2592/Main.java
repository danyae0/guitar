import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        int most = 0;
        int count = 1;
        int mostcount = 0;

        for (int j = 0; j < 9; j++) {
            if (arr[j] == arr[j + 1])
                count++;
            else {
                if (mostcount < count) {
                    most = arr[j];
                    mostcount = count;
                }
                count = 0;
            }
        }

        if (mostcount < count)
            most = arr[9];


        bw.write(sum / 10 + "\n" + most);

        bw.close();
    }
}