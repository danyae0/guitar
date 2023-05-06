import java.io.*;
import java.math.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] s = br.readLine().split(" ");
        
        BigInteger x = new BigInteger(s[0]);
        BigInteger y = new BigInteger(s[1]);
        
        bw.write((x.add(y)).toString());
        bw.close();
    }
}