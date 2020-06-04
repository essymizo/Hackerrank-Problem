import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String args[]){
        List<String[]> data=readInput(System.in);
        String vals[]=data.get(0);
        String quers[]=data.get(1);
        
        int countRes[]=countSim(vals,quers);
        
        for(int res:countRes){
            System.out.println(res);
        }
    }
    
    public static int[] countSim(String []vals,String quers[]){
        Map<String,Integer> hm=new HashMap<String,Integer>();
        
        for(String val: vals){
            if(hm.containsKey(val)){
                int c=hm.get(val);
                hm.put(val,c+1);
            }
            else{
                hm.put(val,1);
            }
        }
        
        int count[]=new int[quers.length];
        
        for(int j=0;j<quers.length;j++){
            String query=quers[j];
            count[j]=hm.containsKey(query)?hm.get(query):0;
        }
        
        return count;
    }
    public static List<String[]> readInput(InputStream input){
        Scanner sc=new Scanner(input);
        
        int numValues=sc.nextInt();
        String Values[]=new String[numValues];
        
        for(int i=0;i<numValues;i++){
            Values[i]=sc.next();
        }
        
        int numQueries=sc.nextInt();
        String Queries[]=new String[numQueries];
        
        for(int j=0;j<numQueries;j++){
            Queries[j]=sc.next();
        }
        sc.close();
        return Arrays.asList(Values,Queries);
    }

}
