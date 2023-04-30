import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        
        String a = s[0];
        String b = s[1];

        String amin = "";
        String bmin = "";
        String amax = "";
        String bmax = "";
        
        for(int i = 0; i < a.length(); i++){
            if(a.substring(i, i+1).equals("6"))
                amin += "5";
            else
                amin += a.substring(i, i+1);
        }
        for(int i = 0; i < b.length(); i++){
            if(b.substring(i, i+1).equals("6"))
                bmin += "5";
            else
                bmin += b.substring(i, i+1);
        }
        int min = Integer.parseInt(amin) + Integer.parseInt(bmin); 
        
        for(int i = 0; i < a.length(); i++){
            if(a.substring(i, i+1).equals("5"))
                amax += "6";
            else
                amax += a.substring(i, i+1);
        }
        for(int i = 0; i < b.length(); i++){
            if(b.substring(i, i+1).equals("5"))
                bmax += "6";
            else
                bmax += b.substring(i, i+1);
        }
        int max = Integer.parseInt(amax) + Integer.parseInt(bmax);
        
        bw.write(min + " " + max);
        bw.close();
    }
}