import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        if(n == 1)
            bw.write("*");
        else{
            for(int i = 0; i < 2 * n; i++){
                if(i % 2 == 0){
                    bw.write("*");
                    for(int j = 0; j < (n - 1) / 2; j++)
                        bw.write(" *");
                }else{
                    for(int k = 0; k < n / 2; k++)
                        bw.write(" *");
                }
                bw.write("\n");
            }
        }
        
        bw.close();
    }
}