import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        double x = Double.parseDouble(s[0]);
        double y = Double.parseDouble(s[1]);
        double z = Double.parseDouble(s[2]);

        if (x * y / z >= x / y * z)
            bw.write((int) (x * y / z) + "");
        else
            bw.write((int) (x / y * z) + "");

        bw.close();
    }
}