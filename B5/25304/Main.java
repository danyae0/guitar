import java.io.*;

public class Main{ 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0; i < B; i++){
            String[] s = br.readLine().split(" ");
            sum += Integer.parseInt(s[0])*Integer.parseInt(s[1]);
        }

        if(sum == A) System.out.print("Yes");
        else System.out.print("No");

        
    }
}