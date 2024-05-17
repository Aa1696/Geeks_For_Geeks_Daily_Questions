package May_Questions;
import java.util.*;
public class Target_difference {
    public int findPair(int n, int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int left = 0;
        int right = 1;
        while(left < n && right < n){
            if(left != right && arr[right] - arr[left] == x) return 1;
            if(arr[right] - arr[left] < x){
                right++;
            }
            else{
                left++;
            }
        }
        return -1;
    }
}
