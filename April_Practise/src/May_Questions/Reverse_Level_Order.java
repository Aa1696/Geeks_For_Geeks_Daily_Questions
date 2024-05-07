package May_Questions;
import java.util.*;
public class Reverse_Level_Order {
    public ArrayList<Integer> reverseLevelOrder(Node node) {
        // code here
        Queue<Node>que = new LinkedList<>();
        que.add(node);
        int level = 0;
        TreeMap<Integer,ArrayList<Integer>>mp = new TreeMap<>();
        while(!que.isEmpty()){
            int sz = que.size();
            ArrayList<Integer>curr_level = new ArrayList<>();
            for(int i=0;i<sz;i++){
                Node nd = que.poll();
                curr_level.add(nd.data);
                if(nd.left != null){
                    que.add(nd.left);
                }
                if(nd.right != null){
                    que.add(nd.right);
                }
            }
            mp.put(level++,curr_level);
        }
        ArrayList<Map.Entry<Integer,ArrayList<Integer>>>arr = new ArrayList<>(mp.entrySet());
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i=arr.size()-1;i>=0;i--){
            for(int v:arr.get(i).getValue()){
                ans.add(v);
            }
        }
        return ans;
    }
}
