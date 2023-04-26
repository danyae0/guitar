import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int x = Integer.parseInt(s[1]);

        int[] arr = new int[n];

        for (int i = 0; i < x; i++) {
            String[] ss = br.readLine().split(" ");
            int a = Integer.parseInt(ss[0]);
            int b = Integer.parseInt(ss[1]);
            int c = Integer.parseInt(ss[2]);

            if (a == b)
                arr[a - 1] = c;
            else {
                for (int j = a - 1; j < b; j++)
                    arr[j] = c;
            }
        }
        for (int k: arr)
            bw.write(k + " ");
        bw.close();


    }
}