import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if (x < 2)
            bw.write("Before");
        else if (x > 2)
            bw.write("After");
        else {
            if (y == 18)
                bw.write("Special");
            else if (y < 18)
                bw.write("Before");
            else
                bw.write("After");
        }

        bw.close();
    }
}