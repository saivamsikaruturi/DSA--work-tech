package org.dsa.arrays.slidingwindow;

public class CountOccurenceOfAnagrams {
    public static void main(String[] args) {
        String txt = "forxxorfxdofr";
        String pat = "for";
        int ans = countAnagrams(txt,pat);
        System.out.println(ans);
    }

    private static int countAnagrams(String txt, String pat) {

        int ans = 0;
        int[] freq = new int[26];
        for(int i=0;i<pat.length();i++){
            freq[pat.charAt(i)-'a']++;
        }

        int i=0;
        int j=0;
        while(j<txt.length()){
            freq[txt.charAt(j)-'a']--;
            if(j-i+1==pat.length()){
                if(allZeros(freq)){
                    ans++;
                }
                freq[txt.charAt(i)-'a']++;
                i++;
            }
            j++;
        }
        return ans;
    }

    private static boolean allZeros(int[] freq) {
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                return false;
            }
        }
        return  true;
    }
}
