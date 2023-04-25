import java.io.*;

public class Main{ 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int count = 0;

        while(!s.equals("#")){
            for(int i = 0; i < s.length(); i++)
                if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || 
                s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || 
                s.charAt(i) == 'u' || s.charAt(i) == 'U') count++;

            bw.write(count+"\n");
            s = br.readLine();
            count = 0;
        }
        bw.close();
    }
}