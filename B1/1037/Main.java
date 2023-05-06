import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");
        int[] arr = new int[n];

        int index = 0;
        for (String ss: s) {
            arr[index] = Integer.parseInt(ss);
            index++;
        }

        Arrays.sort(arr);

        bw.write(Integer.toString(arr[0] * arr[arr.length - 1]));
        bw.close();

    }
}