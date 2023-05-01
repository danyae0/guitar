import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        
        String[] s = br.readLine().split(" ");
        
        int sum = 0;
        
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        
        for(int i = 1; i < x; i++){
            if((i % 2 == 1 && i < 8) || (i % 2 == 0 && i > 7)){
                sum += 31;
            }else if(i == 2){
                sum += 28;
            }else{
                sum += 30;
            }
        }
        sum += y;
        
        int mod = sum % 7;
        if(mod == 0)
            bw.write("SUN");
        else
            bw.write(days[mod - 1]);
        
        bw.close();
    }
}