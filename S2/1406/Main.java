import java.io.*;
import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String s = br.readLine();
        LinkedList < Character > ll = new LinkedList < Character > ();

        for (int i = 0; i < s.length(); i++)
            ll.add(s.charAt(i));

        ListIterator < Character > li = ll.listIterator(ll.size());


        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] ss = br.readLine().split(" ");
            if (ss[0].equals("L")) {
                if (li.hasPrevious()) {
                    li.previous();
                } else {

                }
            } else if (ss[0].equals("D")) {
                if (li.hasNext()) {
                    li.next();
                } else {

                }
            } else if (ss[0].equals("B")) {
                if (li.hasPrevious()) {
                    li.previous();
                    li.remove();
                } else {

                }
            } else {
                li.add(ss[1].charAt(0));
            }
        }

        while (li.hasPrevious()) {
            li.previous();
        }

        while (li.hasNext()) {
            bw.write(li.next());
        }

        bw.close();
    }
}