package com.April;
/*
Will implement the Merge sort logic
Steps:
1. For the given double linked list, will find the mid
2.will refrence the head of the list as the head of the head of the left list
and the mid.next as the head of the refrence of the next part
3.will break the linked list after configuring the left and right
4.Will do inplace merging while maintaing the merge logic
 */
class Node{
    int data;
    Node prev;
    Node next;
    Node(int  data){
        this.data = data;
    }
}
public class Merge_Sort_Doubly_Linked_List {
    static Node sortDoubly(Node head) {
        // add your code here
        if(head==null || head.next == null){
            return head;
        }
        Node left = head;
        Node mid = getMid(head);
        Node right = mid.next;
        mid.next = null;
        Node res = merge(sortDoubly(left),sortDoubly(right));
        return res;
    }
    static Node getMid(Node tmp){
        Node fast = tmp;
        Node slow = tmp;
        while(fast.next!= null && fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static Node merge(Node low,Node high){
        if(low== null) return high;
        if(high == null) return low;
        Node curr = new Node(-1);
        Node tmp = curr;
        while(low != null && high != null){
            if(low.data>high.data){
                tmp.next = high;
                high.prev = tmp;
                high = high.next;
            }
            else{
                tmp.next = low;
                low.prev = tmp;
                low = low.next;
            }
            tmp = tmp.next;
        }
        while(low != null){
            tmp.next = low;
            low.prev = tmp;
            low = low.next;
            tmp = tmp.next;
        }
        while(high !=null){
            tmp.next = high;
            high.prev = tmp;
            high = high.next;
            tmp = tmp.next;
        }
        curr.next.prev = null;
        return curr.next;
    }
}
