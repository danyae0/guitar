import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double n = Double.parseDouble(br.readLine());
        double result = 0.0;

        if (n == 1)
            result = 0;
        else {
            result = (-3 + Math.pow(9 + 4 * 3 * (n - 1), 0.5)) / 6;
        }

        bw.write((int) Math.ceil(result) + 1 + "");

        bw.close();
    }
}