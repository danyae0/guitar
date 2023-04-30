import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());
        char[] arr = new char[n];
        String s = "";

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().charAt(0);
        }

        Arrays.sort(arr);

        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count >= 5)
                    s += Character.toString(arr[i]);
                count = 1;
            }
        }

        if (count >= 5)
            s += Character.toString(arr[n - 1]);

        if (s.equals(""))
            bw.write("PREDAJA");
        else
            bw.write(s);
        bw.close();
    }
}