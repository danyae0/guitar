import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        bw.write((y % 10) * x + "\n" + ((y / 10) % 10) * x + "\n" + (y / 100) * x + "\n" + x * y);
        bw.close();

    }
}