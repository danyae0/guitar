import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            String[] s = br.readLine().split(" ");
            int count = 0;
            for (int j = 0; j < s.length; j++)
                if (Integer.parseInt(s[j]) == 0)
                    count++;
            if (count == 0)
                bw.write("E");
            else if (count == 1)
                bw.write("A");
            else if (count == 2)
                bw.write("B");
            else if (count == 3)
                bw.write("C");
            else
                bw.write("D");

            bw.write("\n");
        }

        bw.close();
    }
}