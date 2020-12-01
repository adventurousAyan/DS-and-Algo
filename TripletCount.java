// { Driver Code Starts
//Initial Template for Java
//https://practice.geeksforgeeks.org/problems/count-the-triplets4615/1

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.countTriplet(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int countTriplet(int arr[], int n) {
        int tripletCount = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int k = 0;k<arr.length;k++) {
            map.put(arr[k], 1);
        }
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++){
                int val = arr[i] + arr[j];
                if(map.containsKey(val)) {
                    tripletCount++;
                }
            }
        }
        return tripletCount;
    }
}
