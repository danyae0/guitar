import java.io.*;

public class Main{ 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        while(!s.equals("END")){
            StringBuffer str = new StringBuffer(s); 
            bw.write(str.reverse().toString() + "\n");

            s = br.readLine();
        }
        bw.close();
    }
}