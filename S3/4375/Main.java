import java.io.*;
import java.util.*;

public class Main {
    public static boolean check(String x){
        for(int i = 0; i < x.length(); i++){
            if(!x.substring(i, i+1).equals("1")){
                return false;
            }
        }
         return true;       
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "";
        
        
        while((s = br.readLine()) != null){
            long n = Long.parseLong(s);
            long ori = Long.parseLong(s);
                if(n % 10 == 1){
                    while(!check(s)){
                        n += n;
                        s = Long.toString(n);
                    }
                }else if(n % 10 == 3){
                    while(!check(s)){
                        n += 6 * ori;
                        if(check(Long.toString(n))){
                            break;
                        }else{
                            n += 4 * ori;
                            s = Long.toString(n);
                        }
                    }
                }else if(n % 10 == 7){
                    while(!check(s)){
                        n += 2 * ori;
                        if(check(Long.toString(n))){
                            break;
                        }else{
                            n += 8 * ori;
                            s = Long.toString(n);
                        }
                    }
                }
                else if(n % 10 == 9){
                    while(!check(s)){
                        n += 8 * ori;
                        if(check(Long.toString(n))){
                            break;
                        }else{
                            n += 2 * ori;
                            s = Long.toString(n);
                        }
                    }
                }   
            bw.write(Long.toString(n).length() + "\n");
        }
        bw.close();
    }
}