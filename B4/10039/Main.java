import java.io.*;

public class Main{ 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 0;
        int sum = 0;

        for(int i = 0; i < 5; i++){
            n = Integer.parseInt(br.readLine());
            if(n < 40) n = 40;
            sum += n;
        }

        bw.write(sum/5+"");
        bw.close();
    }
}