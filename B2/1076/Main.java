import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = {
            "black",
            "brown",
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "violet",
            "grey",
            "white"
        };
        int[] arr = {
            1,
            10,
            100,
            1000,
            10000,
            100000,
            1000000,
            10000000,
            100000000,
            1000000000
        };

        long sum = 1;
        String k = "";
        for (int i = 0; i < 2; i++)
            k += Integer.toString(Arrays.asList(s).indexOf(br.readLine()));

        sum *= arr[Arrays.asList(s).indexOf(br.readLine())] * Long.parseLong(k);

        bw.write(sum + "");
        bw.close();
    }
}