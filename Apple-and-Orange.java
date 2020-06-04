import java.util.Scanner;

public class Solution {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }



        int aCount=0;
        int oCount=0;
        for(int i=0;i<m;i++){
            int aSum=a+apple[i];
            if(aSum>=s && aSum<=t)
                aCount++;
               

        }

        for(int j=0;j<n;j++){
            int oSum=b+orange[j];
            if(oSum>=s && oSum<=t)
                oCount++;
         
        }

        System.out.println(aCount);
        System.out.println(oCount);
    }
}
