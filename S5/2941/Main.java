import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) == 'l' && i < s.length() - 1) || (s.charAt(i) == 'n' && i < s.length() - 1)){
                if(s.charAt(i + 1) == 'j'){
                    count ++ ;
                    i++;
                }else{
                    count++;
                }
            }else if(s.charAt(i) == 'c' || s.charAt(i) == 's' || s.charAt(i) == 'z'){
                if(i < s.length() - 1){
                    if(s.charAt(i + 1) == '-' || s.charAt(i + 1) == '='){
                        count ++;
                        i++;
                    }
                    else{
                        count++;
                    }
                }else{
                    count++;
                }
            }else if(s.charAt(i) == 'd'){
                if(i < s.length() - 2){
                    if(s.charAt(i + 1) == 'z' && s.charAt(i + 2) == '='){
                        count ++;
                        i+=2;
                    }else if(s.charAt(i + 1) == '-'){
                        count++;
                        i++;
                    }else{
                        count++;
                    }
                }else if(i < s.length() - 1){
                    if(s.charAt(i + 1) == '-'){
                        count++;
                        i++;
                    }else{
                        count++;
                    }
                }else{
                    count++;
                }
            }else{
                count++;
            }
        }
        
        bw.write(Integer.toString(count));
        bw.close();

    }
}