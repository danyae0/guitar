import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++)
            arr[i] = Integer.parseInt(br.readLine());

        int x = 0;
        int y = 0;

        if (arr[1] % arr[3] != 0)
            x = arr[1] / arr[3] + 1;
        else
            x = arr[1] / arr[3];

        if (arr[2] % arr[4] != 0)
            y = arr[2] / arr[4] + 1;
        else
            y = arr[2] / arr[4];

        if (x > y)
            bw.write(arr[0] - x + "");
        else
            bw.write(arr[0] - y + "");

        bw.close();
    }
}