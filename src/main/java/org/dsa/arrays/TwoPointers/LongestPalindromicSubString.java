package org.dsa.arrays.TwoPointers;

public class LongestPalindromicSubString {
   static String longestPalindrome(String s){
       if(s.length() == 1 || s.isEmpty()){
           return s;
       }

         String Lps = "";

	   for(int i =1;i<s.length();i++){

           int low = i;
           int high = i;


           while(s.charAt(low) == s.charAt(high)) {
               low--;
               high++;

               if (low == -1 || high == s.length())
                   break;

           }
               String palindrome = s.substring(low + 1, high);
               if (palindrome.length() > Lps.length())
                   Lps = palindrome;

            low = i-1;
            high = i;


           while(s.charAt(low) == s.charAt(high)) {
               low--;
               high++;

               if (low == -1 || high == s.length() )
                   break;

           }
            palindrome = s.substring(low + 1, high);
           if (palindrome.length() > Lps.length())
               Lps = palindrome;



       }

       return  Lps;
}




    public static void main(String[] args) {
        System.out.println(longestPalindrome("ABRBADAADAB"));
    }
}
