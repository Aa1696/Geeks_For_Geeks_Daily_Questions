package May_Questions;
import java.util.*;
public class Serialize_And_Deserailize {
    public ArrayList<Integer> serialize(Node root) {
        // code here
        ArrayList<Integer>ans = new ArrayList<>();
        Queue<Node>que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            Node curr = que.poll();
            if(curr == null){
                ans.add(-1);
                continue;
            }
            ans.add(curr.data);
            que.add(curr.left);
            que.add(curr.right);
        }
        return ans;
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> arr) {
        // code here
        int n = arr.size();
        Node root=new Node(arr.get(0));
        Queue<Node>que = new LinkedList<>();
        que.add(root);
        int indx =1;
        while(!que.isEmpty()){
            Node curr = que.poll();
            if(arr.get(indx) != -1){
                curr.left = new Node(arr.get(indx));
                que.add(curr.left);
            }
            else{
                curr.left = null;
            }
            indx++;
            if(arr.get(indx) != -1){
                curr.right = new Node(arr.get(indx));
                que.add(curr.right);
            }
            else{
                curr.right = null;
            }
            indx++;
        }
        return root;
    }
}
