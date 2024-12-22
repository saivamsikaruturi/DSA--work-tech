package org.dsa.arrays.slidingwindow;

public class LongestSubstringWithoutRepeatingCharacters {

      static  int getLongestLength(String s){
          if(s.equals("")){
              return 0;
          }
          if(s.trim().isEmpty())
          {
              return 1;
          }
          int max = 0;
          int i=0,j=0;
          int[] array = new int[128];
          while(j<s.length()){
              array[s.charAt(j)]++;
              // if character is found
              while(array[s.charAt(j)]>1){
                  array[s.charAt(i)]--;
                  i++;
              }
              max = Math.max(max,j-i+1);
              j++;
          }
          return max;
      }

    public static void main(String[] args) {
        System.out.println(getLongestLength("abcabcbb"));
    }
}
