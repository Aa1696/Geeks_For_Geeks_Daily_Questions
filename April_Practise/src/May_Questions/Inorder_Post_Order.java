package May_Questions;
/*
Given inorder and postorder traversals of a binary tree(having n nodes) in
the arrays in[] and post[] respectively.
The task is to construct a binary tree from these traversals.

Driver code will print the preorder traversal of the constructed tree.

 */
public class Inorder_Post_Order {
    Node buildTree(int in[], int post[], int n) {
        // Your code here
        int pos_end = n-1;
        Node nd =  helper(in,post,0,pos_end,0,n-1);
        return nd;
    }
    Node helper(int[]in, int[]post,int pos_st , int pos_end, int start, int end){
        if(start>end) return null;
        int val = post[pos_end];
        Node node = new Node(val);
        int pos = -1;
        for(int i = start; i<=end ;i++){
            if(in[i] == val){
                pos = i;
                break;
            }
        }
        int leftsize = pos - start;
        int rightsize = end - pos;
        node.left = helper(in,post,pos_st,pos_st+leftsize-1,start,pos-1);
        node.right = helper(in, post, pos_end-rightsize, pos_end-1, pos+1, end);
        return node;
    }
}
