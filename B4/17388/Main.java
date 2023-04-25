import java.io.*;

public class Main{ 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int z = Integer.parseInt(s[2]);
        
        if(x+y+z >=100) bw.write("OK");
        else{
            if(x<y && x<z) bw.write("Soongsil");
            else if(y<x && y<z) bw.write("Korea");
            else bw.write("Hanyang");
        }

        bw.close();
    }
}