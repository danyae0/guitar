import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String s = br.readLine();
        String[][] arr = new String[15][15];

        for (int i = 0; i < s.length(); i++) {
            arr[0][i] = s.substring(i, i + 1);
        }

        for (int i = 1; i < 5; i++) {
            s = br.readLine();
            for (int j = 0; j < s.length(); j++)
                arr[i][j] = s.substring(j, j + 1);
        }

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == null) {

                } else
                    bw.write(arr[j][i]);
            }
        }

        bw.close();
    }
}