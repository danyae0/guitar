import java.io.*;
import java.math.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(n % 5 == 0 ? Integer.toString(n / 5) : Integer.toString(n / 5 + 1));
        bw.close();
    }
}