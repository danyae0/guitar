import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        if (s.length() == 2)
            bw.write(Integer.parseInt(s.substring(0, 1)) + Integer.parseInt(s.substring(1, 2)) + "");
        else if (s.charAt(1) == '0' && s.length() == 3)
            bw.write(Integer.parseInt(s.substring(0, 2)) + Integer.parseInt(s.substring(2, 3)) + "");
        else if (s.charAt(2) == '0' && s.length() == 3)
            bw.write(Integer.parseInt(s.substring(0, 1)) + Integer.parseInt(s.substring(1, 3)) + "");
        else
            bw.write("20");

        bw.close();
    }
}