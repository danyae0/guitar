import java.math.*;
import java.util.*;

public class tmp{
    public static void main(String[] args){
        String s = "314";
        
        System.out.print((new BigInteger(s.substring(0, 1)).multiply(new BigInteger("8").pow(s.length() - 1))).toString());
    }
}