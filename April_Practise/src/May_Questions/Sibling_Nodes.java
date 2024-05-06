package May_Questions;
import java.util.*;
/*
Given a Binary Tree of n nodes, find all the nodes that don't have any siblings. You need to return a list of integers containing all the nodes that don't have a sibling in sorted order (Increasing).

Two nodes are said to be siblings if they are present at the same level, and their parents are the same.

Note: The root node can not have a sibling so it cannot be included in our answer.
 */
public class Sibling_Nodes {
    ArrayList<Integer> noSibling(Node node){
        // code here
        ArrayList<Integer>ans = new ArrayList<>();
        Deque<Node>que = new ArrayDeque<>();
        que.add(node);
        while(!que.isEmpty()){
            int sz = que.size();
            for(int i=0;i<sz;i++){
                Node nd = que.poll();
                if(nd.left == null || nd.right == null){
                    if(nd.left != null){
                        ans.add(nd.left.data);
                        que.add(nd.left);
                    }
                    else if(nd.right != null){
                        ans.add(nd.right.data);
                        que.add(nd.right);
                    }
                }
                else{
                    if(nd.left != null){
                        que.add(nd.left);
                    }
                    if(nd.right != null){
                        que.add(nd.right);
                    }
                }
            }
        }
        if(ans.isEmpty()){
            ans.add(-1);
            return ans;
        }
        Collections.sort(ans);
        return ans;
    }
}
