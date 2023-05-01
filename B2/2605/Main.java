import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        al.add(1);
        for(int i = 1; i < n; i++){
            al.add(Integer.parseInt(s[i]), i + 1);
        }
        
        for(int j = n - 1; j >= 0; j--){
            bw.write(al.get(j) + " ");
        }
        
        bw.close();
    }
}