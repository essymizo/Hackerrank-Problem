// @see https://www.hackerrank.com/challenges/arrays-ds

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i =0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=N-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
    }
}
