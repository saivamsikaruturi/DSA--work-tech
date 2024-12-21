package org.dsa.strings;

public class validPalindrome {

          public static boolean isPalindrome(String s) {
              s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().trim();
              int i = 0;
              int j = s.length()-1;
              while(i<j){
                  if(s.charAt(i)!=s.charAt(j)){
                    return false;
                  }
                  i++;
                  j--;
              }
              return true;
          }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

}
