import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        
        String se = s[0];
        int n = Integer.parseInt(s[1]);
        long sum = 0;
        
        if(se.equals("0"))
            bw.write("0");
        else{
            for(int i = 0; i < se.length(); i++){
                if((int)se.charAt(i) >= 65){
                    sum += ((int)se.charAt(i) - 55) * Math.pow(n, se.length() - 1 - i);
                }else{
                    sum += Integer.parseInt(se.substring(i, i+ 1)) * Math.pow(n, se.length() - 1 - i);
                }
            }
            bw.write(sum + "");
        }
        bw.close();
    }
}