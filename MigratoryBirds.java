/*
https://www.hackerrank.com/challenges/migratory-birds/problem?h_r=profile
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    
    static int migratoryBirds(List<Integer> arr) {
     

        int max_type=0;

        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();

      for(int i=1;i<=5;i++){
          hm.put(i,0);
      }  

      for(int j=0;j<arr.size();j++){
          if(hm.containsKey(arr.get(j))){
              hm.put(arr.get(j),hm.get(arr.get(j))+1);
          }
      }

   int maxValue = 0;
int mKey = 0;
for(Integer key: hm.keySet()){
    if(hm.get(key) > maxValue){
        maxValue = hm.get(key);
        mKey = key;
    }
}
return mKey;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
