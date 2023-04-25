import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split("/");
        int k = Integer.parseInt(s[0]);
        int d = Integer.parseInt(s[1]);
        int a = Integer.parseInt(s[2]);

        if (d == 0)
            bw.write("hasu");
        else if (k + a < d)
            bw.write("hasu");
        else
            bw.write("gosu");

        bw.close();
    }
}