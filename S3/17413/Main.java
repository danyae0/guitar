import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack < Character > stk = new Stack < Character > ();
        
        String s = br.readLine();
        int index = 0;
        
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == '<'){
                while(!stk.empty()){
                    bw.write(stk.pop());
                }
                while(s.charAt(i + index) != '>'){
                    index ++;
                }
                bw.write(s.substring(i, i + index + 1));
                i += index;
                index = 0;
            }
            else if(s.charAt(i + 1) == ' '){
                stk.push(s.charAt(i));
                while(!stk.empty()){
                    bw.write(stk.pop());
                }
                bw.write(" ");
                i++;
            }else{
                stk.push(s.charAt(i));
            }
        }
        
        
        
        if(!stk.empty()){
            stk.push(s.charAt(s.length() - 1));
            while(!stk.empty())
                bw.write(stk.pop());
        }
        
        bw.close();
    }
}