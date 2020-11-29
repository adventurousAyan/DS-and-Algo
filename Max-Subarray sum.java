/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
        int testCaseCnt = Integer.parseInt(scanner.nextLine());
        for(int idx = 0; idx<testCaseCnt;idx++) {
            int sum = Integer.parseInt(scanner.nextLine().split(" ")[1]);
            String[] arr = scanner.nextLine().split(" ");
            SortedMap<Integer, String> map = new TreeMap<>(); 
            for(int i=0; i<arr.length;i++) {
                int s = 0;
                for(int j=i;j<arr.length;j++){
                    
                    s = s +  Integer.parseInt(arr[j]);
                    if(s == sum) {
                        int k = i+1;
                        int l = j + 1;
                        map.put(i, k + " " + l);
                    }
                    else if(s > sum) {
                        break;
                    }
                }
            }
            if(map.keySet().size() > 0) {
                int key = map.firstKey();
                System.out.println(map.get(key));
            }
            else
               System.out.println(-1);
        }
        scanner.close();
        
        //return map.get(key);
        
	}
}
