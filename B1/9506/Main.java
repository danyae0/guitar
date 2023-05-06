import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "";

        while (!(s = br.readLine()).equals("-1")) {
            int N = Integer.parseInt(s);
            StringBuilder sb = new StringBuilder();
            sb.append(s + " = ");
            
            int sum = 0;
            
            for(int i = 1; i <= N / 2; i++){
                if(N % i == 0){
                    sum += i;
                    sb.append(i + " + ");
                }
                if(sum > N){
                    sb.setLength(0);
                    break;
                }
                if(i == N / 2 && sum < N){
                    sb.setLength(0);
                    break;
                }
            }
            if(sb.length() == 0){
                bw.write(s + " is NOT perfect.\n");
            }else{
                bw.write(sb.toString().substring(0, sb.length()- 2) + "\n");
                sb.setLength(0);
            }
        }
        bw.close();
    }
}