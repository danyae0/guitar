import java.io.*;

public class Main{ 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int total = x*y;

        String[] s2 = br.readLine().split(" ");
        int[] arr = new int[5];

        for(int i = 0; i < 5; i++)
            arr[i] = Integer.parseInt(s2[i]) - total;

        for(int i : arr){
            bw.write(i + " ");
        }

        bw.close();
    }
}