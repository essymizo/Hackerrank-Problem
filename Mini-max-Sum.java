import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Long> arrList=new ArrayList<Long>();
        for(int i=0;i<5;i++){
            arrList.add(in.nextLong());
        }
        Collections.sort(arrList);
        Long max=0L;
        for(int j=1;j<5;j++){
            max+=arrList.get(j);
        }
        Long min;
        min=(max-arrList.get(4))+arrList.get(0);
        
        System.out.println(min+" "+max);
        
    }
}
