import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int total = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s[i].equals("1")) {
                count++;
            } else {
                total += count * (count + 1) / 2;
                count = 0;
            }
        }
        
        total += count * (count + 1) / 2;
        bw.write(total + "");
        bw.close();
        
        
    }
}