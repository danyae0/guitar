import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        bw.write(s.substring(0,1));
        for(int i = 1; i < s.length(); i++)
            if(s.substring(i,i+1).equals("-"))
                bw.write(s.substring(i+1, i+2));
        
        
        bw.close();
    }
}