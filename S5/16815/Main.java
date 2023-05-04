import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String s = br.readLine();
        Stack < Character > stk = new Stack < Character > ();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*'){
                bw.write(Integer.toString(stk.size()));
                break;
            }else if (s.charAt(i) == '(')
                stk.push(s.charAt(i));
            else
                stk.pop();
        }
        
        bw.close();
        
        
    }
}