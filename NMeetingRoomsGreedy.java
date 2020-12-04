// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class Driverclass {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) end[i] = Integer.parseInt(inputLine[i]);
            new Meeting().maxMeetings(start, end, n);
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Meeting {
    static void maxMeetings(int start[], int end[], int n) {
    int[]end2 = new int[end.length];
    int[]start2 = new int[end.length];
     for(int p = 0;p<end.length;p++){
        end2[p]= end[p];
        start2[p] = start[p];
    }
       for(int k = 0; k < n-1 ;k++){
           for(int j = 0; j<n-1-k;j++){
               if(end[j] > end[j+1]){
                   int temp = end[j];
                   end[j] = end[j+1];
                   end[j+1] = temp;
                    int temp2 = start[j];
                  start[j] = start[j+1];
                  start[j+1] = temp2;
                   
               }
           }
       }
       List<Integer> meetingList = new ArrayList<>();
       int prev = 0;
       for(int m = 0; m<n;m++){
           if(start[m] > prev){
               for(int k = 0;k < n;k++){
                   if(end[m] == end2[k] && start[m] == start2[k]){
                      meetingList.add(k+1);
                      break;
                   }
               }
               prev = end[m];
           } 
       }
       for(int j = 0; j<meetingList.size();j++){
           System.out.print(meetingList.get(j) + " ");
       }
    }
}
