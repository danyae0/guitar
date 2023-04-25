import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");

        int suma = 0;
        int sumb = 0;

        for (String x : a)
            suma += Integer.parseInt(x);
        for (String x : b)
            sumb += Integer.parseInt(x);

        if (suma >= sumb)
            bw.write(suma + "");
        else
            bw.write(sumb + "");

        bw.close();
    }
}