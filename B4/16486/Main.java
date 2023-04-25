import java.io.*;

public class Main{ 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double x = Double.parseDouble(br.readLine());
        double y = Double.parseDouble(br.readLine());

        bw.write((x*2) + (2*y*3.141592)+"");
        bw.close();
    }
}