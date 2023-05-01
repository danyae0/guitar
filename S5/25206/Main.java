import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        double gpa = 0.0;
        int count = 20;
        double sum = 0;

        for(int i = 0; i < 20; i++){
            String[] s = br.readLine().split(" ");
            sum += Double.parseDouble(s[1]);

            double x = Double.parseDouble(s[1]);
            if(s[2].equals("A+"))
                gpa += x * 4.5;
            else if(s[2].equals("A0"))
                gpa += x * 4.0;
            else if(s[2].equals("B+"))
                gpa += x * 3.5;
            else if(s[2].equals("B0"))
                gpa += x * 3.0;
            else if(s[2].equals("C+"))
                gpa += x * 2.5;
            else if(s[2].equals("C0"))
                gpa += x * 2.0;
            else if(s[2].equals("D+"))
                gpa += x * 1.5;
            else if(s[2].equals("D0"))
                gpa += x * 1.0;
            else if(s[2].equals("P")){
                count--;
                sum -= Double.parseDouble(s[1]);
            }
            
        }
        
        bw.write(Double.toString(gpa / sum));
        bw.close();
    }
}