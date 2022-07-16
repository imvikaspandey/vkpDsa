package com.vkp.recursion;

public class PalindromeChkRecursion {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("AABBCBBAA",0,8)); //true
        System.out.println(checkPalindrome("AABBBBAA",0,7)); // true
        System.out.println(checkPalindrome("AABBCVBBAA",0,9)); // false
        System.out.println(checkPalindrome("ABCD",0,3)); // false
        System.out.println(checkPalindrome("ABBA",0,3)); // true

    }
    public static boolean checkPalindrome(String str, int left, int right){
        if(left >= right){
            return true;
        }

        if (str.charAt(left) != str.charAt(right)){
            return false;
        }
        return checkPalindrome(str, left+1, right-1);
    }
}
