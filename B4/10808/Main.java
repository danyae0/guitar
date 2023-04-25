import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[(int) s.charAt(i) - 97] += 1;
        }

        for (int j : arr)
            bw.write(j + " ");
        bw.close();
    }
}