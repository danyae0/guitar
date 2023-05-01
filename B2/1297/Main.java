import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        double z = Double.parseDouble(s[0]);
        double a = Double.parseDouble(s[1]);
        double b = Double.parseDouble(s[2]);

        double C = Math.pow(Math.pow(z, 2) / (Math.pow(a, 2) + Math.pow(b, 2)), 0.5);

        bw.write((int) Math.floor(C * a) + " " + (int) Math.floor(C * b));


        bw.close();
    }
}