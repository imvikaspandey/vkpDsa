package com.vkp.recursion;

public class OneToNRecursion {
    public static void main(String[] args) {
        print1toN(10);
    }

    public static void print1toN(int n){
        if(n<=0){  // base case to stop recursion
            return ;
        }
        print1toN(n-1); // first it will go to print1toN(0) then will start printing sopln
        System.out.println(n);

    }
}
