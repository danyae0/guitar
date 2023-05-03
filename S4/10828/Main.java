import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stk = new Stack<Integer>();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++){
            String[] s = br.readLine().split(" ");
            
            if(s[0].equals("push"))
                stk.push(Integer.parseInt(s[1]));
            else if(s[0].equals("top")){
                if(stk.empty())
                    bw.write("-1\n");
                else
                    bw.write(stk.peek() + "\n");        
            }
            else if(s[0].equals("pop")){
                if(stk.empty())
                    bw.write("-1\n");
                else
                    bw.write(stk.pop() + "\n");
            }
            else if(s[0].equals("empty")){
                if(stk.empty())
                    bw.write("1\n");
                else
                    bw.write("0\n");
            }else if (s[0].equals("size")){
                bw.write(stk.size() + "\n");
            }
        }
        bw.close();
    }
}