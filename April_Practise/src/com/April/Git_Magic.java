package com.April;

public class Git_Magic {
    public static void main(String[] args) {
        int n =7;
        while(n>0){
            int indx = n&(-n);
            System.out.println("Indx ="+ indx);
            n -=indx;
            System.out.println("New number :"+n);
        }
    }
}
