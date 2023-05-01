import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int count = 0;
        int sum = 0;
        int news = Integer.parseInt(s);

        while (true) {
            count++;
            sum = news / 10 + news % 10;
            news = (news % 10) * 10 + sum % 10;

            if (news == Integer.parseInt(s))
                break;
        }

        if (s.equals("0"))
            bw.write("1");
        else
            bw.write(Integer.toString(count));
        bw.close();
    }
}