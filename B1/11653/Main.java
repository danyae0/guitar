import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int index = 2;

        if (n == 1) {}
        else {
            while (n > 1) {
                if (n % index != 0) {
                    index++;
                } else {
                    bw.write(index + "\n");
                    n /= index;
                }
            }
        }
        bw.close();
    }
}