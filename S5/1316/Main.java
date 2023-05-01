import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());

        String record = "";
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (record.indexOf(s.substring(j, j + 1)) != -1) {
                    if (s.substring(j - 1, j).equals(s.substring(j, j + 1))) {

                    } else {
                        break;
                    }

                } else {
                    record += s.substring(j, j + 1);
                }
                if (j == s.length() - 1) {
                    count++;
                }
            }
            record = "";
        }

        bw.write(Integer.toString(count));
        bw.close();
    }
}