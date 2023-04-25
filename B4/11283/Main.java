import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int uniBase = s.charAt(0) - 44032;

        char chosung = (char) (uniBase / 28 / 21);
        char jungsung = (char) (uniBase / 28 % 21);
        char jongsung = (char) (uniBase % 28);

        System.out.println(((int) chosung * 21 * 28) + ((int) jungsung * 28) + ((int) jongsung + 1));

    }
}