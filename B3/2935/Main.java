import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger x = new BigInteger(br.readLine());
        String s = br.readLine();
        BigInteger y = new BigInteger(br.readLine());

        if (s.equals("+")) bw.write(x.add(y) + "");
        else bw.write(x.multiply(y) + "");

        bw.close();
    }
}