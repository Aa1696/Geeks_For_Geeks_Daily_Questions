package com.April;
/*
Given a singly linked list having n nodes,
your task is to remove every kth node from the linked list.
 */
public class Delete_at_k {
    Node delete(Node head, int k){
        // Your code here
        if(k==1) return null;
        int indx =1;
        Node tmp = head;
        while(tmp != null){
            if((indx+1)%k==0 && tmp.next != null){
                tmp.next = tmp.next.next;
                indx++;
            }
            tmp = tmp.next;
            indx++;
        }
        return head;
    }
}
