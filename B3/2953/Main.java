import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.MIN_VALUE;
        int index = 0 ;
        for(int i = 0; i < 5; i++){
            int sum = 0;
            String[] s = br.readLine().split(" ");
            for(String k : s)
                sum += Integer.parseInt(k);
            if(sum > max) {
                max = sum;
                index = i + 1;
            }
        }

        bw.write(index + " " + max);
        bw.close();
    }
}