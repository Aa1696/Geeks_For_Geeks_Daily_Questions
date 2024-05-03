package May_Questions;
import java.util.*;
class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data= data;
        this.left = null;
        this.right = null;
    }
}
public class Kth_Distance_From_Node {
    ArrayList<Integer> Kdistance(Node root, int k){
        // Your code here
        ArrayList<Integer>ans = new ArrayList<>();
        helper(root,k,ans);
        return ans;
    }
    public void helper(Node root, int k, ArrayList<Integer>ans){
        if(root==null) return;
        if(k==0){
            ans .add(root.data);
            return;
        }
        helper(root.left,k-1,ans);
        helper(root.right,k-1,ans);
    }
}
