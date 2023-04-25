import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        bw.write(
                Math.abs(Integer.parseInt(s[3]) + Integer.parseInt(s[0]) - Integer.parseInt(s[1]) - Integer.parseInt(s[2])) + "");
        bw.close();
    }
}