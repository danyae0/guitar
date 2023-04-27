import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        int init = 0;

        if (a / 2 < b)
            init = a / 2;
        else init = b;

        if (init == 0)
            bw.write("0");
        else {
            int ar = a - (init * 2);
            int brr = b - init;

            while (ar != 0 && c != 0) {
                ar--;
                c--;
            }
            while (brr != 0 && c != 0) {
                brr--;
                c--;
            }

            if (c == 0)
                bw.write(init + "");
            else {
                while (c > 0) {
                    ar -= 2;
                    brr--;
                    c -= 3;
                    init--;
                }
                bw.write(init + "");
            }
        }
        bw.close();
    }
}