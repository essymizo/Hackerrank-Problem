import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, ArrayList<Integer> arr) {
        Collections.sort(arr);
        int max=arr.get(n-1);
        //System.out.println(max);
        int count=1;
        for(int i=n-2;i>=0;i--){
            if(arr.get(i)<max){
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int ar_i = 0; ar_i < n; ar_i++){
            arr.add(in.nextInt());
        }
        int result = birthdayCakeCandles(n, arr);
        System.out.println(result);
    }
}
