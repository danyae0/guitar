import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String s = "";
            while ((s = br.readLine()) != null) {
                int[] arr = new int[4];

                for (int i = 0; i < s.length(); i++) {
                    if ((int) s.charAt(i) >= 97)
                        arr[0]++;
                    else if ((int) s.charAt(i) >= 65)
                        arr[1]++;
                    else if ((int) s.charAt(i) >= 48)
                        arr[2]++;
                    else
                        arr[3]++;
                }
                for (int j: arr) {
                    bw.write(j + " ");
                    bw.flush();
                }
                bw.write("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        bw.close();
    }
}