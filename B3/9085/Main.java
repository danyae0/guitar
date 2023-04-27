import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" ");
            int sum = 0;
            for (int j = 0; j < a; j++)
                sum += Integer.parseInt(s[j]);
            bw.write(sum + "\n");
        }
        bw.close();
    }
}