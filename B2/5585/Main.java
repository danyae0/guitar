import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 1000 - Integer.parseInt(br.readLine());
        int result = 0;

        result += n / 500;
        n -= (n / 500) * 500;

        result += n / 100;
        n -= (n / 100) * 100;

        result += n / 50;
        n -= (n / 50) * 50;

        result += n / 10;
        n -= (n / 10) * 10;

        result += n / 5;
        n -= (n / 5) * 5;

        result += n;

        bw.write(result + "");
        bw.close();
    }
}