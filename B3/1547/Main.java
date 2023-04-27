import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = {
            1,
            0,
            0
        };

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]) - 1;
            int y = Integer.parseInt(s[1]) - 1;
            int tmp = 0;

            tmp = arr[x];
            arr[x] = arr[y];
            arr[y] = tmp;
        }
        for (int i = 0; i < 3; i++)
            if (arr[i] >= 1)
                bw.write(i + 1 + "");

        bw.close();


    }
}