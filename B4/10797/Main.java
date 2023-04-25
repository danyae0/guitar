import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String[] arr = br.readLine().split(" ");

        int count = 0;

        for (String k : arr)
            if (k.equals(s))
                count += 1;

        bw.write(count + "");
        bw.close();

    }
}