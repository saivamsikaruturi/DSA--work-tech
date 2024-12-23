package org.dsa.strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    static String getCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        if (strs[0].equals("")) {
            return "";
        }


        if (strs.length == 1) {
            return strs[0];
        }

        String start = strs[0];
        String end = strs[strs.length - 1];


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) == end.charAt(i)) {
                sb.append(start.charAt(i));
            } else {
                break;
            }

        }

        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(getCommonPrefix(new String[]{"club","clap","clove"}));
    }
}
