import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[2];

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(br.readLine()) == 0)
                arr[0]++;
            else
                arr[1]++;
        }
        if (arr[0] > arr[1])
            bw.write("Junhee is not cute!");
        else
            bw.write("Junhee is cute!");
        
        bw.close();
    }
}