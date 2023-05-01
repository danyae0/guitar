import java.io.*;
import java.util.*;

public class Main {
    public static int factorial(int n, int sum){
        if(n==0) return sum;
        else{
            sum += n;
            factorial(n--, sum);
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        
        if(y == 0) bw.write("1");
        else if (y == 1) bw.write(Integer.toString(x));
        else{
            int sum = 0;
            bw.write(Integer.toString(factorial(5, sum)));
        }
    }
}