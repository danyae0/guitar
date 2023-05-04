import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack < String > shirt = new Stack < String > ();
        Stack < String > pants = new Stack < String > ();
        Stack < String > socks = new Stack < String > ();
        
        for(int i = 0; i < n; i++){
            int k = Integer.parseInt(br.readLine());
            
            for(int j = 0; j < k; j++){
                String[] s = br.readLine().split(" \\(");
                if(s[1].equals("shirt)")){
                    shirt.push(s[0]);
                }else if(s[1].equals("pants)")){
                    pants.push(s[0]);
                }else{
                    socks.push(s[0]);
                }
            }
            while(!shirt.empty() && !pants.empty() && !socks.empty()){
                bw.write(shirt.pop() + ", " + pants.pop() + ", " + socks.pop());
                bw.write("\n");
            }
            while(!shirt.empty()){
                shirt.pop();
            }
            while(!pants.empty()){
                pants.pop();
            }
            while(!socks.empty()){
                socks.pop();
            }
            bw.write("\n");
        }
        
        

        bw.close();


    }
}