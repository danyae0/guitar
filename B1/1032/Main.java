import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        String[] s = new String[n];
        
        if(n == 1)
            bw.write(br.readLine());
        else{
            for(int i = 0; i < n; i++)
                s[i] = br.readLine();
            
            for(int i = 0; i <s[0].length(); i++){
                for(int j = 0; j < s.length - 1; j++){
                    if(s[j].charAt(i) != s[j + 1].charAt(i)){
                        sb.append("?");
                        break;
                    }
                    if(j == s.length - 2)
                        sb.append(s[0].substring(i, i+1));
                }

            }
        }
        bw.write(sb.toString());
        bw.close();
    }
}