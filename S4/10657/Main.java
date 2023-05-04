import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack < Integer > stk = new Stack < Integer > ();

        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++){
            String[] s = br.readLine().split(" ");
            int k = Integer.parseInt(s[1]);
            if(stk.empty()){
                stk.push(k);
            }else{
                if(stk.peek() <= k){
                    stk.push(k);
                    continue;
                }
                while(stk.peek() > k){
                    stk.pop();
                    if(stk.empty()){
                        break;
                    }
                }
                stk.push(k);
            }
            
        }

        bw.write(Integer.toString(stk.size()));
        bw.close();
    }
}