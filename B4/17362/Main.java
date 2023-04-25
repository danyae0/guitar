import java.io.*;

public class Main{ 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if(n%8 == 1) bw.write("1");
        else if(n%8 == 5) bw.write("5");
        else if(n%4 == 3) bw.write("3");
        else if(n%8 == 4 || n%8 == 6) bw.write("4");
        else bw.write("2");

        bw.close();
    }
}