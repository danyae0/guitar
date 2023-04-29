import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        BigInteger sum = new BigInteger("0");

        for (int i = 0; i < n; i++) {
            sum = sum.add(new BigInteger(Integer.toString((int)s.charAt(i) - 96)).multiply(new BigInteger("31").pow(i)));
        }
        
        sum = sum.mod(new BigInteger("1234567891"));
        
        bw.write(sum.toString());
        bw.close();
    }
}