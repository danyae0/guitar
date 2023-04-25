import java.io.*;

public class Main{ 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());

        if(x+y+z!=180) bw.write("Error");
        else if(x==y && y == z) bw.write("Equilateral");
        else if(x==y || y==z||x==z) bw.write("Isosceles");
        else bw.write("Scalene");

        bw.close();
    }
}