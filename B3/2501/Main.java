import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);

        int count = 0;
        int index = 1;

        while (true) {
            if (x % index == 0)
                count++;
            if (count == y) {
                bw.write(index + "");
                break;
            }
            index++;
            if (index > x) {
                bw.write("0");
                break;
            }

        }
        bw.close();
    }
}