import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if (n % 10 != 0)
            bw.write("-1");
        else {
            int x = n / 300;
            int y = n / 60;
            int z = n / 10;
            if (x > 0) {
                y -= x * 5;
                z -= x * 30;
            }
            if (y > 0) {
                z -= y * 6;
            }
            bw.write(x + " " + y + " " + z);
        }
        bw.close();
    }
}