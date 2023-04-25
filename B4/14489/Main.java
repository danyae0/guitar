import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        int z = Integer.parseInt(br.readLine());

        if (a >= 2 * z || (a + b >= 2 * z) || b >= 2 * z)
            bw.write(a + b - 2 * z + "");
        else
            bw.write(a + b + "");
        bw.close();
    }
}