package org.dsa.strings;

public class isSubSequence {
    public static boolean checkSubSequence(String s, String t) {
        int i=0,j=0;
        if(s.length()==0) return true;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i==s.length();

    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "agbhkc";
        System.out.println(checkSubSequence(s,t));
    }
}
