import java.io.*;

public class Main{ 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int z = Integer.parseInt(s[2]);

        if(x*y <= z) bw.write("0");
        else bw.write((x*y) - z +"");

        bw.close();

    }
}