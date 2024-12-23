package org.dsa.Hashing.HashMap;

import java.util.HashMap;
import java.util.Map;

public class IsmorphicStrings {
    public static boolean isIsomorphicBruteForce(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Replace characters from `s` to `t` and validate the mapping
        for (int i = 0; i < s.length(); i++) {
            char source = s.charAt(i);
            char target = t.charAt(i);

            // Replace all occurrences of `source` in `s` with `target`
            s = s.replace(source, target);

            // If the transformed `s` is not equal to `t`, return false

        }

        if (!s.equals(t)) {
            return false;
        }

        return true;
    }

    public static boolean isIsomorphic(String s, String t){
        Map<Character,Character> map = new HashMap<>();

        if(s.length() != t.length())
            return false;

         for(int i=0;i<s.length();i++){
             char current = s.charAt(i);
             char replacement = t.charAt(i);
             if(!map.containsKey(current)){
                 if(!map.containsValue(replacement)){
                     map.put(current,replacement);
                 }
                 else {
                     return false;
                 }
             }
             else{
                 char mapped = map.get(current);
                 if(mapped!=replacement)
                     return false;
             }
         }

         return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphicBruteForce("egg","add"));
        System.out.println(isIsomorphic("egg","add"));
    }

}
