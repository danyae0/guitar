import java.io.*;
import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++){
            String[] s = br.readLine().split(" ");
            
            for(int j = 0; j < s.length(); j++){
                for(int k > s[j].length; k > = 0; k--){
                    bw.write(s[k]);
                }
                bw.write(" ");
            }
        }
        bw.close();
    }
}