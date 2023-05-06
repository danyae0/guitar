import java.io.*;
import java.util.*;

public class Main {
    
    public static int factorial(int n){
        if(n == 1 || n == 0)
            return 1;
        else{
            return n * factorial(--n);
        }
            
    }
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        
        int[] arrx = new int[x];
        int[] arry = new int[y];
        
        bw.write(Integer.toString(factorial(x) / factorial(y) / factorial(x - y)));
        bw.close();
    }
}