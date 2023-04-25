import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]) - 1;

        for(int i = 0; i<x ; i++){
            String s2 = br.readLine();
            for(int j = y; j >= 0; j--){
                bw.write(s2.charAt(j));
            }
            bw.write("\n");
        }

        bw.close();
    }
}